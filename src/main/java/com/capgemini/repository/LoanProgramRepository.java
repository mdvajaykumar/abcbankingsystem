package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entites.LoanProgram;

public interface LoanProgramRepository extends JpaRepository<LoanProgram, Integer> {

}
