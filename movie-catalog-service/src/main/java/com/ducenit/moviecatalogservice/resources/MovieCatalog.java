package com.ducenit.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducenit.moviecatalogservice.models.CatalogItem;


@RestController
@RequestMapping("/catalog")
public class MovieCatalog {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getMovieCatalog(@PathVariable("userId") String userId)
	{
		return Collections.singletonList(new CatalogItem("Avengers","Useless",3));
	}

}
