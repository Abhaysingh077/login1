package com.userprofile.Entity;

import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 20)
    String FirstName;
    @Column(length = 20)
    String LastName;
    @Column(length = 12)
    int MobileNumber;
    @Column(length = 20,unique=true)
    String EmailID;
    @Column(length = 20)
    String Organisation;
    @Column(length = 20)
    String Designation;
    @Column(length = 20)
    String SkypeID;
    @Column(length = 20)
    String SecondryEmail;
    @Column(length = 20)
    String StreetName;
    @Column(length = 20)
    String City;
    @Column(length = 20)
String State;
    @Column(length = 20)
String Country;
    @Column(length = 10)
String ZipCode;
    @Column(length = 100)
    @Lob
    byte[] ProfilePhoto;
    @Column(name = "image_url")
	String imageUrl;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getOrganisation() {
		return Organisation;
	}
	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getSkypeID() {
		return SkypeID;
	}
	public void setSkypeID(String skypeID) {
		SkypeID = skypeID;
	}
	public String getSecondryEmail() {
		return SecondryEmail;
	}
	public void setSecondryEmail(String secondryEmail) {
		SecondryEmail = secondryEmail;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public byte[] getProfilePhoto() {
		return ProfilePhoto;
	}
	public void setProfilePhoto(byte[] bs) {
		ProfilePhoto = bs;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", MobileNumber="
				+ MobileNumber + ", EmailID=" + EmailID + ", Organisation=" + Organisation + ", Designation="
				+ Designation + ", SkypeID=" + SkypeID + ", SecondryEmail=" + SecondryEmail + ", StreetName="
				+ StreetName + ", City=" + City + ", State=" + State + ", Country=" + Country + ", ZipCode=" + ZipCode
				+ ", ProfilePhoto=" + Arrays.toString(ProfilePhoto) + ", imageUrl=" + imageUrl + "]";
	}
	
	public Admin(int id, String firstName, String lastName, int mobileNumber, String emailID, String organisation,
			String designation, String skypeID, String secondryEmail, String streetName, String city, String state,
			String country, String zipCode, byte[] profilePhoto, String imageUrl) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		MobileNumber = mobileNumber;
		EmailID = emailID;
		Organisation = organisation;
		Designation = designation;
		SkypeID = skypeID;
		SecondryEmail = secondryEmail;
		StreetName = streetName;
		City = city;
		State = state;
		Country = country;
		ZipCode = zipCode;
		ProfilePhoto = profilePhoto;
		this.imageUrl = imageUrl;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

  

   

}
