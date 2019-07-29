package com.team.medico.dtosym;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "symptomdisease")

public class Symptoms_Disease {
 
 @Column(name ="symptoms_id")
 private int SymptomsId;
 
 @Column(name ="disease_id")
 private int DiseaseId;

 

}