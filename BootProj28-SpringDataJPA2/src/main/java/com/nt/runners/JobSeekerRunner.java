package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerService;

@Component
public class JobSeekerRunner implements CommandLineRunner {
	
	@Autowired
	private IJobSeekerService seeker;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("JobSeekerRunner.run()");
		JobSeeker job= new JobSeeker("chanchal","hyd","BE(CSE)",90000.0f);
		//String msg = seeker.regiterJobSeeker(job);
		Iterable<JobSeeker> list = seeker.showAllJobSeeker();
		list.forEach(System.out::println);
		//System.out.println(msg);
	}
	

}
