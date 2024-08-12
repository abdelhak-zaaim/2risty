package com.touristy.touristy.service;

import com.touristy.touristy.model.entity.Review;
import com.touristy.touristy.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
   private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void deleteReviewById(Long id){
       reviewRepository.deleteById(id);
    }

    public Optional<Review> findReviewById(Long id){
       return reviewRepository.findById(id);
    }
}
