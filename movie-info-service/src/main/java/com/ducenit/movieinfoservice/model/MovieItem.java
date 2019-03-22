package com.ducenit.movieinfoservice.model;

public class MovieItem {
	
	private String movieId;
	private String name;
	
	public MovieItem(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
