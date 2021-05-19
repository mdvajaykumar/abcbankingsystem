package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.ICustomerLoanReportImpl;


@RestController
@RequestMapping("/api/lad/")
public class LadController {

	@Autowired
	ICustomerLoanReportImpl icustomerloanreportimpl;
	
	@GetMapping("/{id}")
	public String checklad(@PathVariable int id) {
		String s1=icustomerloanreportimpl.hello(id);
		return s1;
	}
}
