package com.ducenit.movieratingservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducenit.movieratingservice.models.Rating;

@RestController
@RequestMapping("/ratings")
public class MovieRatings {
	
    @RequestMapping("/{movieId}")
	public Rating getMovieRatings(@PathVariable("movieId")String movieId)
	{
    	return new Rating(movieId,4);
	}

}
