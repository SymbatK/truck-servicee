package io.javabrains.truckcatalogservice.models;

public class Truck {

	private String truckId;
	private String name;

	public Truck() {

	}

	public Truck(String truckId, String name) {
		this.truckId = truckId;
		this.name = name;
	}

	public String getTruckId() {
		return truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
