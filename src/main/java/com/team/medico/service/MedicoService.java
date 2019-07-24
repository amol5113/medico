package com.team.medico.service;



import com.team.medico.model.Admin;
import com.team.medico.model.Doctor;
import com.team.medico.model.History;
import com.team.medico.model.Patient;
import com.team.medico.model.PreferredLanguage;
import com.team.medico.model.User;
import java.util.List;


public interface MedicoService {
	// public void createUser(User user);
	// public void removeUser(int userId);
	// public void modifyUser(User user);
	// public List<User> selectAllUsers();
	public boolean checkUser(User user);

	public User getUser(String emailId);

	public void insertPatient(Patient patient, User user, History history);

	public PreferredLanguage getLanguage(String languageId);

	public void insertDoctor(Doctor doctor, User user);

	public void insertAdmin(Admin admin, User user);
	public List<Doctor> selectAllDoctor();
	public List<Patient> selectAllPatient();
	public Doctor selectDoctor1(String email);

	public Doctor approveDoctor(String email);
	
}