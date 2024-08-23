package com.example.service;

import com.example.book.BookServiceReview;
import com.example.entity.Review;
import com.example.repository.ReviewRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ReviewService {

    @Inject
    ReviewRepository reviewRepository;

    @Inject
    @RestClient
    BookServiceReview bookServiceReview;

    public List<Review> getReviews() {
        List<Review> reviews = reviewRepository.listAll();
        return reviews;
    }
}
