package com.ducenit.movieratingservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducenit.movieratingservice.models.Rating;
import com.ducenit.movieratingservice.models.UserRatings;

@RestController
@RequestMapping("/ratings")
public class MovieRatings {
	
    @RequestMapping("/{movieId}")
	public Rating getMovieRatings(@PathVariable("movieId")String movieId)
	{
    	return new Rating(movieId,4);
	}
    
    @RequestMapping("/users/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId")String userId)
	{
    	List<Rating> movieRatings=Arrays.asList(new Rating("1",4),new Rating("2",3));
    	UserRatings userRatings=new UserRatings();
    	userRatings.setMovieRatings(movieRatings);
    	return userRatings;
	}

}
