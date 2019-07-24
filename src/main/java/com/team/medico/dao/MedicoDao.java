package com.team.medico.dao;

import com.team.medico.model.Admin;
import com.team.medico.model.Doctor;
import com.team.medico.model.History;
import com.team.medico.model.Patient;
import com.team.medico.model.PreferredLanguage;
import com.team.medico.model.User;
import java.util.List;

public interface MedicoDao {	
	public void saveUser(final User user);
	public void savePatient(final Patient patient);
	//public void deleteById(int userId);	
	//public void update(User user) ;
	//public List<User> getAll() ;
	public boolean validateUser(final User user);
	public User getUserByEmailId(String emailId);
	public PreferredLanguage getLanguageById(String languageId);
	public void saveHistory(History history);
	public void insertDoctor(Doctor doctor,User user);
	public void saveAdmin(Admin admin);
	public List<Doctor> getAllDoctor();
	public Doctor getDoctor1(String email);
	public List<Patient> getAllPatient();
	public Doctor approveDoctor(String email);
}

