package io.javabrains.truckcatalogservice.models;

public class Rating {

	private String truckId;
	private int rating;

	public Rating() {

	}

	public Rating(String truckId, int rating) {
		this.truckId = truckId;
		this.rating = rating;
	}

	public String getTruckId() {
		return truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}