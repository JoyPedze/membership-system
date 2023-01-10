package com.joy.membership.web.dto;

import javax.persistence.Column;

public class UserRegistrationDto {

	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userPackage;
	private String cell;
	private String occupation;
	private String address;
	private Long credits;
	
	public UserRegistrationDto(){
		
	}

	public UserRegistrationDto(String title, String firstName, String lastName, String email, String password, String userPackage, String cell, String occupation, String address) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userPackage = userPackage;
		this.cell = cell;
		this.occupation = occupation;
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPackage() {
		return userPackage;
	}

	public void setUserPackage(String userPackage) {
		this.userPackage = userPackage;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
