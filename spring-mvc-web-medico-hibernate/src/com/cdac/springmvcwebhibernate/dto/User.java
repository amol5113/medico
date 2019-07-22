package com.cdac.springmvcwebhibernate.dto;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "user12")
public class User {

@Id
@Column(name = "email_id")
private String emailId;
@Column(name = "user_name")
private String userName;
@Column(name = "password")
private String password;
@Column(name = "gender")
private String gender;
@Column(name = "contact_no")
private String contactNo;
@Column(name = "aadhar")
private double aadharNo;
@Column(name = "dob")
@Temporal(TemporalType.DATE)
private Date dob;
@Column(name = "is_active")
private String isActive;
@Column(name = "type_of_user")
private String userType;


//Doctor field*******************

@Transient
private String degree;
@Transient
private String degreeImg;
@Transient
private String license;
@Transient
private String licenseImg;
@Transient
private String currentPost;
@Transient
private String prefLanguage;
@Transient
private String yearsOfExperience;
@Transient
private String practiceHours;
@Transient
private double duration;
@Transient
private String awards;
@Transient
private String specialization;
@Transient
private String specialTraining;


public User() {
super();
// TODO Auto-generated constructor stub
}

public String getDegree() {
	return degree;
}

public void setDegree(String degree) {
	this.degree = degree;
}

public String getDegreeImg() {
	return degreeImg;
}

public void setDegreeImg(String degreeImg) {
	this.degreeImg = degreeImg;
}

public String getLicense() {
	return license;
}

public void setLicense(String license) {
	this.license = license;
}

public String getLicenseImg() {
	return licenseImg;
}

public void setLicenseImg(String licenseImg) {
	this.licenseImg = licenseImg;
}

public String getPrefLanguage() {
	return prefLanguage;
}

public void setPrefLanguage(String prefLanguage) {
	this.prefLanguage = prefLanguage;
}

public String getYearsOfExperience() {
	return yearsOfExperience;
}

public void setYearsOfExperience(String yearsOfExperience) {
	this.yearsOfExperience = yearsOfExperience;
}

public String getPracticeHours() {
	return practiceHours;
}

public void setPracticeHours(String practiceHours) {
	this.practiceHours = practiceHours;
}

public double getDuration() {
	return duration;
}

public void setDuration(double duration) {
	this.duration = duration;
}

public String getAwards() {
	return awards;
}

public void setAwards(String awards) {
	this.awards = awards;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public String getSpecialTraining() {
	return specialTraining;
}

public void setSpecialTraining(String specialTraining) {
	this.specialTraining = specialTraining;
}

public String getCurrentPost() {
	return currentPost;
}

public void setCurrentPost(String currentPost) {
	this.currentPost = currentPost;
}




//user field***************

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

@Override
public String toString() {
	return "User [emailId=" + emailId + ", userName=" + userName + ", password=" + password + ", gender=" + gender
			+ ", contactNo=" + contactNo + ", aadharNo=" + aadharNo + ", dob=" + dob + ", isActive=" + isActive
			+ ", userType=" + userType +  "]";
}


}