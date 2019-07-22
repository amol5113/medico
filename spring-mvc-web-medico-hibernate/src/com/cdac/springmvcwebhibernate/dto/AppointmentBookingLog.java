package com.cdac.springmvcwebhibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "appointmentbookinglog")  
public class AppointmentBookingLog {
	
	
	@Column(name = "app_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "app_time")
	private String time;
	@Column(name = "doc_email_id")
	private String doctorId;
	@Column(name = "pat_email_id")
	private String patientId;
	@Column(name = "app_statuso")
	private String status;
	
	@OneToOne
	@JoinColumn(name = "doc_email_id)")
	private Doctor doctor;
	
	//@OneToOne
	//@JoinColumn(name = "pat_email_id")
	//private Patient fk_patient_email_id_app;
	
	public AppointmentBookingLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentBookingLog(Date date,String time, String doctorId, String patientId) {
		super();
		this.date = date;
		this.time = time;
		this.doctorId = doctorId;
		this.patientId = patientId;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AppointmentBookingLog [date=" + date + ", time=" + time + ", doctorId=" + doctorId
				+ ", patientId=" + patientId + ", status=" + status + "]";
	}
	
}
