package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService service ;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Integer a = 256987654;
		Integer b = 256987654;
		*/
		String a = "Java";
		String b = "JAva";
		Doctor doc = new Doctor();
		System.out.println(doc.hashCode());
		System.out.println(a.hashCode()+"---"+b.hashCode());
		/*
		try {
			System.out.println("In runner class");
			Doctor doc1 = new Doctor("Jane Dr" , "multispecialist" , 100000.0);
			Doctor doc2 = new Doctor("Bothra Dr" , "Gastroenterologist" , 100000.0);
			Doctor doc3 = new Doctor("Yende Dr" , "Heart" , 100000.0);
			Doctor doc4 = new Doctor("Chandak Dr" , "Bone" , 100000.0);
			Doctor doc5 = new Doctor("Jawalekar Dr" , "Heart" , 100000.0);
			System.out.println(service.regiterDoctor(List.of(doc1, doc2, doc3, doc4, doc5)));
			
			System.out.println("\n-----------------------------------------------------------");
			service.showAllDoctor().forEach(System.out::println);
			
			System.out.println("Press any key to terminate");
			System.in.read();  // reads one character
			System.in.skip(System.in.available()); // clear remaining chars (like Enter)
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}

}
