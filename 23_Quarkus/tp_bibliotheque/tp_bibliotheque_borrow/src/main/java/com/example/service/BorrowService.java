package com.example.service;

import com.example.book.BookServiceBook;
import com.example.dto.BookDto;
import com.example.dto.UserDto;
import com.example.entity.Borrow;
import com.example.repository.BorrowRepository;
import com.example.user.UserServiceUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class BorrowService {

    @Inject
    BorrowRepository borrowRepository;

    @Inject
    @RestClient
    UserServiceUser userServiceUser;

    @Inject
    @RestClient
    BookServiceBook bookServiceBook;

    public List<Borrow> getBorrowedBooks() {
        List<Borrow> borrows = borrowRepository.listAll();
        return borrows.stream().map(this::borrowDetails).collect(Collectors.toList());
    }

    public Borrow getBorrowById(Long id) {
        return Optional.ofNullable(borrowRepository.findById(id))
                .map(this::borrowDetails).orElseThrow();

    }

    @Transactional
    public Borrow createBorrow(Borrow borrow) {
        validateBorrow(borrow);
        borrow.setBorrowStart(LocalDateTime.now());
        borrow.setBorrowEnd(LocalDateTime.now().plusDays(14));
        borrowRepository.persist(borrow);
        return borrow;
    }

    @Transactional
    public Borrow updateBorrow(Long id, Borrow borrow) {
        validateBorrow(borrow);
        borrow.setId(id);
        borrowRepository.persist(borrow);
        return borrow;
    }

    @Transactional
    public void deleteBorrow(Long id, Borrow borrow) {
        validateBorrow(borrow);
        borrowRepository.delete(borrow);
    }

    public Borrow borrowDetails(Borrow borrow) {
        UserDto userDto = userServiceUser.getUserById(borrow.getUserId());
        BookDto bookDto = bookServiceBook.getBook(borrow.getBookId());
        borrow.setUserDto(userDto);
        borrow.setBookDto(bookDto);
        return borrow;
    }

    public List<Borrow> getBorrowedBooksByUserId(Long userId) {
        if (userId == null) {
            throw new WebApplicationException("userId is null");
        }
        List<Borrow> borrowList = borrowRepository.find(String.valueOf(userId)).list();

        if (borrowList.isEmpty()) {
            throw new WebApplicationException("No borrow found");
        }

        return borrowList.stream()
                .map(this::borrowDetails).collect(Collectors.toList());
    }

    private void validateBorrow(Borrow borrow) {
        if (borrow.getBookDto().getTitle() == null || borrow.getBookDto().getTitle().isEmpty()) {
            throw new WebApplicationException(400);
        }

        if (bookServiceBook.getBook(borrow.getBookId()) == null) {
            throw new WebApplicationException(400);
        }
    }
}
