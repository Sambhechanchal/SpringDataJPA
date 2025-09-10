package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="JPA_JS_TAB")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeeker {
	
	@Column(name="JS_JSID")
	@Id
	@SequenceGenerator(name="gen1", sequenceName = "SEQ1", initialValue = 2000, allocationSize=1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer jsid;
	
	@Column(length=30, name="JS_JSNAME")
	@NonNull
	private String jsname;
	
	@Column(length=30, name="JS_ADDRS")
	@NonNull
	private String addrs;
	
	@Column(length=30, name="JS_QLFY")
	@NonNull
	private String qlfy;
	
	@Column(name="JS_EXP_SALARY")
	@NonNull
	private float expectedSalary;

}
