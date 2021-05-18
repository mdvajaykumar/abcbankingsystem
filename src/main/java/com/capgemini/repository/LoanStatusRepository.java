package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entites.LoanStatus;

public interface LoanStatusRepository extends JpaRepository<LoanStatus, Integer> {

}
