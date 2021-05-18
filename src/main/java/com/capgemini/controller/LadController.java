package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.CustomerLoanReportImpl;


@RestController
@RequestMapping("/api/lad/")
public class LadController {

	@Autowired
	CustomerLoanReportImpl customerloanreportimpl;
	
	@GetMapping("/{customerid}")
	public String checklad(@PathVariable int customerid) {
		String s1 = customerloanreportimpl.hello(customerid);
		return  s1;
	}
}
