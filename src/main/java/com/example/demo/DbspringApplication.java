package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.EtudiantRepository;
import com.example.demo.entites.Etudiant;

@SpringBootApplication
public class DbspringApplication implements CommandLineRunner {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	public static void main(String[] args) {
		    SpringApplication.run(DbspringApplication.class, args);
				
				
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("-------------------------------------");
		etudiantRepository.save(new Etudiant(null,"leila","leilagmail.com", new Date(),45));
		etudiantRepository.save(new Etudiant(null,"Aicha","aichagmail.com", new Date(),45));
		etudiantRepository.save(new Etudiant(null,"fatim","fatimgmail.com", new Date(),95));
		etudiantRepository.save(new Etudiant(null,"korotoum","korogmail.com", new Date(),75));
		etudiantRepository.findAll().forEach(et->{
			
			System.out.println( et.toString());
		});
		System.out.println("-------------------------------------");
		
		Etudiant et=etudiantRepository.findById(1L).get();
		System.out.println( et.getName());
		System.out.println("***************************************");
		etudiantRepository.findByScore(45).forEach(ett->{
			System.out.println(ett.getName());
			
			
		});;
	}

	
	
	
}
