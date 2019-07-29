package com.team.medico.dtosym;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "symptoms")

public class Symptoms {
 
 @Column(name = "symptoms_id")
 private int SymptomsId;
 
 @Column(name = "symptoms")
 private String Symptoms;
 
 @ManyToMany(mappedBy = "symptoms")
 private Set<Disease> disease = new HashSet<Disease>();

 public int getSymptomsId() {
  return SymptomsId;
 }

 public void setSymptomsId(int symptomsId) {
  SymptomsId = symptomsId;
 }

 public String getSymptoms() {
  return Symptoms;
 }

 public void setSymptoms(String symptoms) {
  Symptoms = symptoms;
 }

 @Override
 public String toString() {
  return "Symptoms [SymptomsId=" + SymptomsId + ", Symptoms=" + Symptoms + "]";
 }
 

}
