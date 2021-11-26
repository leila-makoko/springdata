package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	 public List<Etudiant>findByScore(int score );

}
