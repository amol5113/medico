package com.cdac.springmvcwebhibernate.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.springmvcwebhibernate.dao.UserDao;
import com.cdac.springmvcwebhibernate.dto.Doctor;
import com.cdac.springmvcwebhibernate.dto.DoctorAll;
import com.cdac.springmvcwebhibernate.dto.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;


	public void insert(User user) {
		//Doctor doctor = new Doctor();
		
		Doctor doctor =new Doctor();
		
		doctor.setDegree(user.getDegree());
		doctor.setDegreeImg(user.getDegreeImg());
		doctor.setLicense(user.getLicense());
		doctor.setLicenseImg(user.getLicenseImg());
		doctor.setCurrentPost(user.getCurrentPost());
		doctor.setPrefLanguage(user.getPrefLanguage());
		doctor.setYearsOfExperience(user.getYearsOfExperience());
		doctor.setPracticeHours(user.getPracticeHours());
		doctor.setDuration(user.getDuration());
		doctor.setAwards(user.getAwards());
		doctor.setSpecialization(user.getSpecialization());
		doctor.setSpecialTraining(user.getSpecialTraining());
		
		doctor.setEmailId(user.getEmailId());
		doctor.setPassword(user.getPassword());
		userDao.save(user,doctor);
	}
	/*public void insert(Doctor doctor) {
		//Doctor doctor = new Doctor();
		
		User user =new User();
		user.setUserName(doctor.getUserName());
		user.setEmailId(doctor.getEmailId());
		user.setPassword(doctor.getPassword());
		user.setGender(doctor.getGender());
		user.setContactNo(doctor.getContactNo());
		user.setAadharNo(doctor.getAadharNo());
		user.setDob(doctor.getDob());
		user.setIsActive(doctor.getIsActive());
		user.setUserType(doctor.getUserType());
		
		
		//doctor.setCurrentPost(user.getCurrentPost());
		
		userDao.save(user,doctor);
	}*/
/*
	public void removeUser(int userId) {
		userDao.deleteById(userId);
	}

	public void modifyUser(User user) {
		userDao.update(user);
	}

	public List<User> selectAllUsers() {
		return userDao.getAll();
	}

	@Override
	public boolean checkUser(User user) {
		return userDao.validateUser(user);
	}
	*/
}