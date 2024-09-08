package com.egjson;

public class Address {
	
	private String Street;

	private String City;
	private long Postcode;
	
	public Address() {}
	public Address(String street, String city, long postcode) {
		super();
		Street = street;
		City = city;
		Postcode = postcode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public long getPostcode() {
		return Postcode;
	}
	public void setPostcode(long postcode) {
		Postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", Postcode=" + Postcode + "]";
	}
	

}
