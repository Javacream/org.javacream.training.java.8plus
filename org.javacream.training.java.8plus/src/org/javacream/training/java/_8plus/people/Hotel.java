package org.javacream.training.java._8plus.people;

import java.util.List;

public class Hotel implements AddressProvider, HotelInfo{

	public Address getAddress() {
		return address;
	}

	private Address address;
	private List<String> roomCategories;
	private int numberOfRooms;

	public Hotel(Address address, List<String> roomCategories, int numberOfRooms) {
		super();
		this.address = address;
		this.roomCategories = roomCategories;
		this.numberOfRooms = numberOfRooms;
	}

	public List<String> getRoomCategories() {
		return roomCategories;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	@Override
	public String getCity() {
		return AddressProvider.super.getCity();
	}

}
