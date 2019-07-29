
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
@Table(name = "disease")
public class Disease {
 
 @Column(name ="disease_id")
 private int DiseaseId;
 
 @Column(name = "disease")
 private int Disease;

 @Column(name = "description")
 private String Description;
 
 
 public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

@ManyToMany
 @JoinTable(name = "symptomdisease",joinColumns = {@JoinColumn(name="disease_id")},inverseJoinColumns = {@JoinColumn(name="symptoms_id")})
 private Set<Symptoms> symptoms = new HashSet<Symptoms>();
 public int getDiseaseId() {
  return DiseaseId;
 }

 public void setDiseaseId(int diseaseId) {
  DiseaseId = diseaseId;
 }

 public int getDisease() {
  return Disease;
 }

 public void setDisease(int disease) {
  Disease = disease;
 }

 @Override
 public String toString() {
  return "Disease [DiseaseId=" + DiseaseId + ", Disease=" + Disease + "]";
 }
 

}
