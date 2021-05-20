package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entites.LoanStatus;
import com.capgemini.service.ICustomerLoanReport;



@RestController
@RequestMapping("/api/lad/")
public class LadController {

	
	
	@Autowired
	ICustomerLoanReport icustomerloanreport;
	
	@GetMapping("/{id}")
	public String checklad(@PathVariable int id) {
		String s1=icustomerloanreport.hello(id);
		return s1;
	}
	
	@GetMapping("/allrecords")
	public List<LoanStatus> allrecords() {
		return icustomerloanreport.findallrecords();
	}
	
	@DeleteMapping("{id}")
	public String deletelad(@PathVariable int id) {
		String s1 = icustomerloanreport.deleteById(id);
		return s1;
		
		}
}
