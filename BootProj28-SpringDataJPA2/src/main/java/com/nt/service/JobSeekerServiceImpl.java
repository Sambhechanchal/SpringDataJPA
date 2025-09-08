package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service("jobService")
public class JobSeekerServiceImpl implements IJobSeekerService {
	
	@Autowired
	private IJobSeekerRepository jobRepo;
	

	@Override
	public String regiterJobSeeker(JobSeeker seeker) {
		System.out.println("JobSeekerServiceImpl.regiterJobSeeker()");
		JobSeeker job=jobRepo.save(seeker);
		
		return "JobSeeker object is saved :: "+ job.getJsid();
	}

}
