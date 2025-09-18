package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IJobSeekerRepository;

@Component
public class JobSeekerRunner implements CommandLineRunner {

  
	@Autowired
	private IJobSeekerRepository jsRepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		try {
			jsRepo.findByAddrsEquals("hyd").forEach(System.out::println);
			System.out.println("----------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			jsRepo.readByAddrsEquals("pune").forEach(System.out::println);
			
			System.out.println("----------------------------------------------------");
			
			jsRepo.getByAddrsEquals("amt").forEach(System.out::println);
			
			System.out.println("-----------------------------------------------------");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		*/
		/*
		try {
			
			jsRepo.findByExpectedSalaryBetween(30000.0, 100000.0).forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			
			//jsRepo.findByExpectedSalaryGreaterThanEqualAndExpectedSalaryLessThanEqual(40000.0, 90000.0).forEach(System.out::println);
			
			jsRepo.findByExpectedSalaryGreaterThanAndExpectedSalaryLessThan(40000.0, 90000.0).forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		/*
		try {
			jsRepo.findByAddrsInOrderByAddrsAsc(List.of("hyd" , "amt" , "pune")).forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		/*
		try {
			jsRepo.findByJsnameStartingWith("a").forEach(System.out::println);
			
			System.out.println("----------------------------------------------");
			jsRepo.findByAddrsEndingWith("e").forEach(System.out::println);
			System.out.println("----------------------------------------------");
			jsRepo.findByJsnameContaining("a").forEach(System.out::println);;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			jsRepo.findByJsnameEqualsIgnoreCase("Achal").forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		try {
			jsRepo.findByJsnameLikeOrAddrsLike("achal", "amt").forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}// run method
	

}//class
