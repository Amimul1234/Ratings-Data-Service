package com.rahi.ratingsdataservice.controller;

import com.rahi.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Amimul Ehsan
 * @Created at 10/17/21
 * @Project Ratings Data Service
 */

@RestController
@RequestMapping("ratingsData")
public class RatingsDataController {
    @GetMapping("{movieId}")
    public Rating getRating( @PathVariable("movieId") String movieId ) {
        return new Rating(movieId, 4);
    }
}
