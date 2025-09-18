package com.nt.runners;

import java.util.List;

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
		
		/*
		String msg = seeker.deleteJsByIdsInBatch(List.of(2001,2002,2003));
		System.out.println(msg);
		*/
		/*
		JobSeeker job = new JobSeeker();
		//job.setAddrs("achal");
		job.setExpectedSalary(90000.0f);
		seeker.showJobSeekerByExampleData(job, true, "jsname").forEach(System.out::println);
		*/
		
		JobSeeker job = seeker.findJobSeekerById(2004);
		System.out.println("JobSeeker Details :: "+job);
		
		
	}// run method
	

}//class
