package com.ducenit.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducenit.movieinfoservice.model.MovieItem;

@RestController
@RequestMapping("/movies")
public class MovieInfo {
	
	
	@RequestMapping("/{movieId}")
	public MovieItem getMovieInfo(@PathVariable("movieId") String movieId)
	{
		return new MovieItem(movieId,"SuperDeluxe");
	}

	
}
