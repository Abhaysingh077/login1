package com.userprofile.Entity;

import javax.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "UserUpload")
@SQLDelete (sql = "UPDATE user_upload SET deleted=true WHERE id=?")
@Where (clause = "deleted=false")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(length = 20)
	private  String contactOwner;
	@Column(length = 20)
	private  String firstName;
	@Column(length = 20)
	private  String lastName;
	private  long mobileNumber;
	@Column(length = 30, unique = true)
	private  String emailID;

	@Column(length = 30)
	private  String organisationName;
	@Column(length = 20)
	private  String designation;
	private  long alternativeNumber;
	@Column(length = 20)
	private  String skypeID;
	@Column(length = 30)
	private  String secondryEmail;
	@Column(length = 20)
	private  String streetName;

	@Column(length = 20)
	private  String city;
	@Column(length = 20)
	private  String state;
	@Column(length = 20)
	private  String country;
	private  Integer zipCode;
	@Column(name = "file_type")
	String fileType;
	@Lob
	@Column(name = "image_data")
	byte[] imageData;
	String description;
	@Column(name = "image_url")
	String imageUrl;
	public Users() {
	}

	private Users(int id, String contactOwner, String firstName, String lastName, long mobileNumber, String emailID, String organisationName,
			String designation, long alternativeNumber, String skypeID, String secondryEmail, String streetName, String city, String state,
			String country, Integer zipCode, String fileType, byte[] imageData, String description, String imageUrl) {
		this.id = id;
		this.contactOwner = contactOwner;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailID = emailID;
		this.organisationName = organisationName;
		this.designation = designation;
		this.alternativeNumber = alternativeNumber;
		this.skypeID = skypeID;
		this.secondryEmail = secondryEmail;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.fileType = fileType;
		this.imageData = imageData;
		this.description = description;
		this.imageUrl = imageUrl;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactOwner() {
		return contactOwner;
	}

	public void setContactOwner(String contactOwner) {
		this.contactOwner = contactOwner;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getAlternativeNumber() {
		return alternativeNumber;
	}

	public void setAlternativeNumber(long alternativeNumber) {
		this.alternativeNumber = alternativeNumber;
	}

	public String getSkypeID() {
		return skypeID;
	}

	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}

	public String getSecondryEmail() {
		return secondryEmail;
	}

	public void setSecondryEmail(String secondryEmail) {
		this.secondryEmail = secondryEmail;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setImageData(String filename) {
	}
}
