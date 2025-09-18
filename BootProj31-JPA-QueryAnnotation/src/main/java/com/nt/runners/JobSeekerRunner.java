package com.nt.runners;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Component
public class JobSeekerRunner implements CommandLineRunner {

  
	@Autowired
	private IJobSeekerRepository jsRepo;
	//private IJobSeekerService jsRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
		jsRepo.showJobSeekerByExpected(20000.0, 80000.0).forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		/*
			
			try {
			System.out.println("----------------Entity Query------------------------");
			jsRepo.searchAllJobSeeker(20000.0, 80000.0).forEach(System.out::println);
			
			System.out.println("\n-----------------Scalar operation specific mul column value-------------------------");
			List<Object[]> obj =jsRepo.searchJobSeekerMulColVal();
			for(Object[] ob:obj) {
			System.out.println(Arrays.toString(ob));
			}
			
			System.out.println("\n-----------------Scalar operation for specific single col value----------------------------");
			
			System.out.println(jsRepo.searchJobSeekerSglColVal());
			
			}catch(Exception e) {
			e.printStackTrace();
			}
			*/
		/*
		try {
			System.out.println("----------------Entity Query------------------------");
			Optional<JobSeeker> opt = jsRepo.getJobSeeker("achal");
			if(opt.isPresent()) {
				System.out.println("JobSeeker Deatils :: "+ opt.get());
			}else {
				System.out.println("Record not found");
			}
			
			System.out.println("\n----------------Entity Query for multiple col value------------------------");
			Optional<Object> opt1 = jsRepo.getJobSeekerDeatils(2005);
			if(opt1.isPresent()) {
				Object[] obj =(Object[]) opt1.get();
				for(Object o:obj) {
					System.out.print(o+" ");
				}
			}else {
				System.out.println("Record not found");
			}
			
			System.out.println("\n----------------Entity Query for single col value------------------------");
			Optional<JobSeeker> opt2 = jsRepo.getJobSeeker("achal");
			if(opt2.isPresent()) {
				System.out.println("JobSeeker Deatils :: "+ opt2.get());
			}else {
				System.out.println("Record not found");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		try {
			System.out.println("Total Count of JobSeeker :: "+ jsRepo.getDistinctCount());
			System.out.println("---------------------------------------------------");
			Object[] obj =(Object[])jsRepo.getAggregateData();
			System.out.println("JobSeeker count :: "+ obj[0]);
			System.out.println("JobSeeker sum of expectedSalary :: "+ obj[1]);
			System.out.println("JobSeeker min of expectedSalary :: "+ obj[2]);
			System.out.println("JobSeeker max of expectedSalary :: "+ obj[3]);
			System.out.println("JobSeeker avg of expectedSalary :: "+ obj[4]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}// run method
	

}//class
