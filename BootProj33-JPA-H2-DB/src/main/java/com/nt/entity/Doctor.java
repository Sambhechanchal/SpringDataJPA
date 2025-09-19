package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Doctor")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor {
	
	@Id
	@Column(name="Doc_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	
	@NonNull
	@Column(name="Doc_name" ,length=25)
	private String dname;
	
	@NonNull
	@Column(name="Doc_specialization" , length=25)
	private String specialization;
	
	@NonNull
	@Column(name="Doc_income")
	private double income;
	

}
