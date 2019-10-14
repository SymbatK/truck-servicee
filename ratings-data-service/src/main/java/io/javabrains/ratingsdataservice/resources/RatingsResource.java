package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.models.Rating;
//import io.javabrains.ratingsdataservice.models.UserRating;
import io.javabrains.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/trucks/{truckId}")
	public Rating getRating(@PathVariable("truckId") String truckId) {
		return new Rating(truckId, 4);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("123", 4),
				new Rating("456", 5)
		);


		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}