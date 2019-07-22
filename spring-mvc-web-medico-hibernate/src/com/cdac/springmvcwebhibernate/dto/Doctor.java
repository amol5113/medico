package com.cdac.springmvcwebhibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name ="doctor12")
public class Doctor {

	@Id
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "password1")
	private String password;
	@Column(name = "degree")
	private String degree;
	@Column(name = "degree_img")
	private String degreeImg;
	@Column(name = "license")
	private String license;
	@Column(name = "license_img ")
	private String licenseImg;
	@Column(name = "current_post ")
	private String currentPost;
	@Column(name = "pref_language ")
	private String prefLanguage;
	@Column(name = "years_of_experience ")
	private String yearsOfExperience;
	@Column(name = "practice_hours")
	private String practiceHours;
	@Column(name = "duration")
	private double duration;
	@Column(name = "awards")
	private String awards;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "special_training ")
	private String specialTraining;

	//User field**********************
		/*@Transient
		private String userName;
		@Transient
		private String gender;
		@Transient
		private String contactNo;
		@Transient
		private double aadharNo;
		@Transient
		@Temporal(TemporalType.DATE)
		private Date dob;
		@Transient
		private String isActive;
		@Transient
		private String userType;
		
	*/
	@OneToOne
	@JoinColumn(name = "email_id")
	private User user;

	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCurrentPost() {
		return currentPost;
	}

	public void setCurrentPost(String currentPost) {
		this.currentPost = currentPost;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//user field*************************
	/*public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	}*/

	/*@Override
	public String toString() {
		return "Doctor [emailId=" + emailId + ", password=" + password + ", degree=" + degree + ", degreeImg="
				+ degreeImg + ", license=" + license + ", licenseImg=" + licenseImg + ", currentPost=" + currentPost
				+ ", prefLanguage=" + prefLanguage + ", yearsOfExperience=" + yearsOfExperience + ", practiceHours="
				+ practiceHours + ", duration=" + duration + ", awards=" + awards + ", specialization=" + specialization
				+ ", specialTraining=" + specialTraining + ", user=" + user + ", userName=" + userName + ", gender="
				+ gender + ", contactNo=" + contactNo + ", aadharNo=" + aadharNo + ", dob=" + dob + ", isActive="
				+ isActive + ", userType=" + userType + "]";
	}*/

	

	@Override
	public String toString() {
		return "Doctor [emailId=" + emailId + ", password=" + password + ", degree=" + degree + ", degreeImg="
				+ degreeImg + ", license=" + license + ", licenseImg=" + licenseImg + ", currentPost=" + currentPost
				+ ", prefLanguage=" + prefLanguage + ", yearsOfExperience=" + yearsOfExperience + ", practiceHours="
				+ practiceHours + ", duration=" + duration + ", awards=" + awards + ", specialization=" + specialization
				+ ", specialTraining=" + specialTraining + ", user=" + user + "]";
	}

	

}
