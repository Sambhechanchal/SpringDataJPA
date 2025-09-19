package com.nt.service;

import com.nt.entity.Doctor;


public interface IDoctorService {
	
	public String regiterDoctor(Iterable<Doctor> doc);
	public Iterable<Doctor> showAllDoctor();

}
