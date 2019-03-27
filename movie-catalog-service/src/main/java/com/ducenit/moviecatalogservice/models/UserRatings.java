package com.ducenit.moviecatalogservice.models;

import java.util.List;

public class UserRatings {

	private List<Rating> movieRatings;
	public UserRatings() {
		super();
	}

	public UserRatings(List<Rating> movieRatings) {
		super();
		this.movieRatings = movieRatings;
	}
	public List<Rating> getMovieRatings() {
		return movieRatings;
	}

	public void setMovieRatings(List<Rating> movieRatings) {
		this.movieRatings = movieRatings;
	}

}
