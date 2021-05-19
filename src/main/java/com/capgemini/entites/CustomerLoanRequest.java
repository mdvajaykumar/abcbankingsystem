package com.capgemini.entites;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class CustomerLoanRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double age;
	private double annualincome;
	private String loantype;
	private String loanstatus;
	private String email;
	private String mobile;
	private String gender;
	private String city;
	private String state;
	private String pannumber;
	private String nationality;
	
	//@OneToMany(targetEntity=LoanStatus.class,cascade = CascadeType.ALL)
	//@JoinColumn(name="customer_ref_id", referencedColumnName = "customerid")
	////private List<LoanStatus> loanStatus;
	

}
