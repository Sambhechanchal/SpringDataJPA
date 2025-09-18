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
		System.out.println("JobSeekerRunner.run()");
		//JobSeeker job= new JobSeeker("manvi","hyd","BE(CSE)",90000.0f);
		//JobSeeker job = new JobSeeker();
		/*	String msg = seeker.regiterJobSeeker(job);
			Iterable<JobSeeker> list = seeker.showAllJobSeeker();
			list.forEach(System.out::println);
			System.out.println(msg);
			*/
		try {
		System.out.println("JobSeekerRunner.run()");
		JobSeeker job1= new JobSeeker("kajal","amt","BE(CSE)",40000.0f);
		JobSeeker job2= new JobSeeker("manu","delhi","BE(CSE)",70000.0f);
		JobSeeker job3= new JobSeeker("vinu","pune","BE(CSE)",90000.0f);
		JobSeeker job4= new JobSeeker("raksha","amt","BE(CSE)",80000.0f);
		JobSeeker job5= new JobSeeker("shradhha","pune","BE(CSE)",75000.0f);
		JobSeeker job6= new JobSeeker("shruti","mumbai","BE(CSE)",65000.0f);
		//JobSeeker job = new JobSeeker();
			String msg = seeker.regiterChunkOfJobSeeker(List.of(job1,job2,job3, job4,job5,job6));
			Iterable<JobSeeker> list = seeker.showAllJobSeeker();
			list.forEach(System.out::println);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
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
		
		/*
		String msg = seeker.insertOrUpdateJSeeker(1001, "Amravati");
		System.out.println(msg);
		*/
		/*
		String msg = seeker.removeJsById(1001);
		System.out.println(msg);
		*/
		/*
		try {
			String msg = seeker.removeAllJsByIds(List.of(1,2,50));
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		/*
		try {
			String msg = seeker.removeAllJobSeeker(List.of(52,1,2,1102));
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		/*	
			try {
				String msg  = seeker.removeAll();
				System.out.println(msg);
			}catch(Exception e) {
				e.printStackTrace();
			}
			*/
	}// main
	

}//class
