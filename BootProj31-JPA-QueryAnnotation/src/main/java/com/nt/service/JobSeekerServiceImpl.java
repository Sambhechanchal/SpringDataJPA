//JobSeekerServiceImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service("jobService")
public class JobSeekerServiceImpl implements IJobSeekerService {

  
	@Autowired
	private IJobSeekerRepository jobRepo;
	/*
		@Override
		public List<JobSeeker> showJobSeekerByExpected(double start, double end) {
			
			//return jobRepo.searchJobSeekerByExpectedSalary(start, end);
		}
	*/
}
