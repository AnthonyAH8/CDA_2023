package com.example.entity;

import com.example.dto.BookDto;
import com.example.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime borrowStart;
    private LocalDateTime borrowEnd;

    @Column(name = "book_id")
    private Long bookId;

    @Transient
    public BookDto bookDto;

    @Column(name = "user_id")
    private Long userId;

    @Transient
    public UserDto userDto;

}
