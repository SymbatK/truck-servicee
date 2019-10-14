package io.javabrains.ratingsdataservice.models;

public class Rating {
		private String truckId;
		private int rating;

    public Rating(String truckId, int rating) {
			this.truckId = truckId;
			this.rating = rating;
		}

		public String getTruckId() {
			return truckId;
		}

		public void setTruckId(String movieId) {
			this.truckId = movieId;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}
}
