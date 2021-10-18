package com.rahi.ratingsdataservice.controller;

import com.rahi.ratingsdataservice.model.Rating;
import com.rahi.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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

    @GetMapping("user/{userId}")
    public UserRating getUserRating( @PathVariable("userId") String userId ) {

        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );

        UserRating userRating = new UserRating();

        userRating.setUserRatings(ratings);
        return userRating;
    }

    //Why you should not return list
    /*
    If it is an object then you can easily add field, and it will be backward compatible
     */
}
