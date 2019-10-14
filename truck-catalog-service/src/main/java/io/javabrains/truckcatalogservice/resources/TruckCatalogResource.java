package io.javabrains.truckcatalogservice.resources;

import io.javabrains.truckcatalogservice.models.CatalogItem;
import io.javabrains.truckcatalogservice.models.Truck;
import io.javabrains.truckcatalogservice.models.Rating;
import io.javabrains.truckcatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class TruckCatalogResource {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;



	@Autowired
	private WebClient.Builder webClientBuilder;

	public TruckCatalogResource() {
	}

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);

		return ratings.getUserRating().stream()
				.map(rating -> {
					Truck truck = restTemplate.getForObject("http://truck-info-service/trucks/" + rating.getTruckId(), Truck.class);
					return new CatalogItem(truck.getName(),"", rating.getRating());
				})
				.collect(Collectors.toList());

	}
}