package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository docRepo;
	
	@Override
	public String regiterDoctor(Iterable<Doctor> doc) {
		 docRepo.saveAll(doc);
		return  " Doctor object are saved";
	}
	@Override
	public Iterable<Doctor> showAllDoctor() {
		
		return docRepo.findAll();
	}
}
