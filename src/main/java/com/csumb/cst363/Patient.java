package com.csumb.cst363;

/*
 * This class is used to transfer data to/from patient templates.
 */
public class Patient {
	
	private int id;  // unique id generated by database.
	private String last_name;
	private String first_name;
	private String birthdate;  // yyyy-mm-dd
	private String ssn;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String primaryName;  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPrimaryName() {
		return primaryName;
	}
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", last_name=" + last_name + ", first_name=" + first_name
				+ ", birthdate=" + birthdate + ", ssn=" + ssn + ", street=" + street + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + ", primaryName=" + primaryName + "]";
	}

}
