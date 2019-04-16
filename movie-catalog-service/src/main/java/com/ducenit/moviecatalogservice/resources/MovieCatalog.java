package com.ducenit.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ducenit.moviecatalogservice.models.CatalogItem;
import com.ducenit.moviecatalogservice.models.MovieItem;
import com.ducenit.moviecatalogservice.models.Rating;
import com.ducenit.moviecatalogservice.models.UserRatings;
 


@RestController
@RequestMapping("/catalog")
public class MovieCatalog {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getMovieCatalog(@PathVariable("userId") String userId)
	{
		UserRatings userRatings=restTemplate.getForObject("http://movie-rating-service"+"/ratings/users/"+userId,UserRatings.class);
		List<Rating> movieRatings=userRatings.getMovieRatings();
		List<CatalogItem> movieCatalogItemList=new ArrayList<CatalogItem>();
		CatalogItem movieCatalogItem;
		for(int i=0;i<movieRatings.size();i++)
		{
			MovieItem movieItem=restTemplate.getForObject("http://movie-info-service"+"/movies/"+movieRatings.get(i).getMovieId(),MovieItem.class);
			movieCatalogItem=new CatalogItem(movieItem.getName(),"All Time classic ",movieRatings.get(i).getRatingId());
			movieCatalogItemList.add(movieCatalogItem);
		}
		
		return movieCatalogItemList;
	}

}
