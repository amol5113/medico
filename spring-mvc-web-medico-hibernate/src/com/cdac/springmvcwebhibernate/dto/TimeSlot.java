package com.cdac.springmvcwebhibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "timeslot")  
public class TimeSlot {
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "start_time")
	private String startTime;
	@Column(name = "end_time")
	private String endTime;
	@Column(name = "slot_id")
	private int slotId;
	@Column(name = "time_slot_date")
	private Date date;
	@Column(name = "time_slot_status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "fk_doctor_email_id_time")
	private Doctor doctor;
	
	public TimeSlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeSlot(String emailId,String startTime,String endTime,int slotId,Date date,String status) {
		super();
		this.emailId = emailId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.slotId = slotId;
		this.date = date;
		this.status = status;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
