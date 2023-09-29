package io.project.ratingdataservice.resources;


import io.project.ratingdataservice.models.Ratings;
import io.project.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ratingsdata")
public class RatingResource {

    @RequestMapping("/movies/{movieId}")
    public Ratings getMovieRating(@PathVariable("movieId") String movieId) {
        return new Ratings(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }

}
