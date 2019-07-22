package com.cdac.springmvcwebhibernate.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorAll {
	
	@Id
	private String emailId;
	private String userName;
	private String password;
	private String gender;
	private String contactNo;
	private double aadharNo;
	private Date dob;
	private String isActive;
	private String userType;
	private double currentPost;
	
	public DoctorAll() {
		super();
	}
	
	public DoctorAll(String emailId, String userName, String password, String gender, String contactNo, double aadharNo,
			Date dob, String isActive, String userType, double currentPost) {
		super();
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.contactNo = contactNo;
		this.aadharNo = aadharNo;
		this.dob = dob;
		this.isActive = isActive;
		this.userType = userType;
		this.currentPost = currentPost;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public double getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(double aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public double getCurrentPost() {
		return currentPost;
	}
	public void setCurrentPost(double currentPost) {
		this.currentPost = currentPost;
	}

	@Override
	public String toString() {
		return "DoctorAll [emailId=" + emailId + ", userName=" + userName + ", password=" + password + ", gender="
				+ gender + ", contactNo=" + contactNo + ", aadharNo=" + aadharNo + ", dob=" + dob + ", isActive="
				+ isActive + ", userType=" + userType + ", currentPost=" + currentPost + "]";
	}	
}
