package com.example.demo.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity


@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(length = 50)
	private String Email;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance ;
	private int score;
	
	
	

}
