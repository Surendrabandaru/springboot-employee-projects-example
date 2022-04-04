package com.fragmadata.vo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "employeeName","designation" ,"joiningDate", "emailId", "mobileNumber", "gender", "status", "address", "state",
		"city", "country", "createdDate", "createdBy" })
@Generated("jsonschema2pojo")
public class EmployeeRequest {

	@JsonProperty("employeeName")
	private String employeeName;
	
	@JsonProperty("designation")
	private String designation;
	
	@JsonProperty("joiningDate")
	private String joiningDate;
	@JsonProperty("emailId")
	private String emailId;
	@JsonProperty("mobileNumber")
	private Integer mobileNumber;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("status")
	private String status;
	@JsonProperty("address")
	private String address;
	@JsonProperty("state")
	private String state;
	@JsonProperty("city")
	private String city;
	@JsonProperty("country")
	private String country;
	@JsonProperty("createdDate")
	private String createdDate;
	@JsonProperty("createdBy")
	private String createdBy;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("employeeName")
	public String getEmployeeName() {
		return employeeName;
	}

	@JsonProperty("employeeName")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@JsonProperty("joiningDate")
	public String getJoiningDate() {
		return joiningDate;
	}

	@JsonProperty("joiningDate")
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	@JsonProperty("emailId")
	public String getEmailId() {
		return emailId;
	}

	@JsonProperty("emailId")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@JsonProperty("mobileNumber")
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	@JsonProperty("mobileNumber")
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("createdDate")
	public String getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("createdDate")
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("createdBy")
	public String getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("createdBy")
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}