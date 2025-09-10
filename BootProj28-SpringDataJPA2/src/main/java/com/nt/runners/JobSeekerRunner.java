package com.nt.runners;

import java.util.Optional;

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
		//JobSeeker job= new JobSeeker("manvi","hyd","BE(CSE)",90000.0f);
		JobSeeker job = new JobSeeker();
		/*	String msg = seeker.regiterJobSeeker(job);
			Iterable<JobSeeker> list = seeker.showAllJobSeeker();
			list.forEach(System.out::println);
			System.out.println(msg);
			*/
		
		/*Iterable<JobSeeker> list = seeker.showAllJobSeekerByIds(List.of(1,1102,1001));
		list.forEach(System.out::println);
		*/
		/*
		Optional<JobSeeker> opt= seeker.showJsById(10011);
		if(opt.isPresent()) {
			JobSeeker js = opt.get();
			System.out.println(js);
		}else {
			System.out.println("JobSeeker is not found");
		}*/
		
		/*String msg = seeker.fetchJsById(1001);
		System.out.println(msg);
		*/
		
//		System.out.println("Total o of records are :: "+seeker.countOfAllJobSeeker());
		/*
		
		if(seeker.showJobSeekerExistsById(10011)) {
			System.out.println("JobSeeker Object is exixts ");
		}else {
			System.out.println("JobSeeker Object is not exixts ");
		}
		
		*/
		/*
		try {
		JobSeeker js = seeker.getJobseekerById(10011);
		System.out.println(js);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		String msg = seeker.insertOrUpdateJSeeker(1001, "Amravati");
		System.out.println(msg);
	}// main
	

}//class
