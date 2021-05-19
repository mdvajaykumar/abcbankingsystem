package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entites.CustomerLoanRequest;
import com.capgemini.exception.CustomerLoanRequestNotFoundException;
import com.capgemini.repository.CustomerLoanRequestRepository;

@Service
public class CustomerLoanReportImpl implements ICustomerLoanReport {

	@Autowired
	CustomerLoanRequestRepository customerLoanRequestRepository;

	@Override
	public String hello(int id) {
		if (!customerLoanRequestRepository.existsById(id)) {
			throw new CustomerLoanRequestNotFoundException("Check the id and Try again");
		}

		CustomerLoanRequest ld = customerLoanRequestRepository.findById(id).get();
		 double loan_amt=0.0;
		    double emi=0.0;
		    double tenure=0;
		    
		if((ld.getAge()>20 && ld.getAge()<=60) && (ld.getAnnualincome()<300000 )){
			return "You are not eligible for loan";
		}
		else if(ld.getAge()>=20 && ld.getAge()<=30) {
	    		double intrate=6.0/12/100;
	    		if(ld.getAnnualincome()>300000 && ld.getAnnualincome()<=500000) {
	    			loan_amt=1500000;
	    			tenure=(60- (ld.getAge()));
	    			emi=(loan_amt*intrate)*Math.pow(1+intrate, tenure)/(Math.pow(1+intrate,tenure-1));
	    			
	    		}
	    		else if(ld.getAnnualincome()>500000 && ld.getAnnualincome()<=1000000) {
	    			loan_amt=3000000;
	    			tenure=((60-ld.getAge()));
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
	    		}
	    		else if(ld.getAnnualincome()>1000000) {
	    			loan_amt=5000000;
	    			tenure=((60-ld.getAge()));
	    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
	    		}
	    
		}
		else if(ld.getAge()>30 && ld.getAge()<=50) {
    		double intrate=8.0/12/100;
    		if(ld.getAnnualincome()>300000 && ld.getAnnualincome()<=500000) {
    			loan_amt=1200000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		else if(ld.getAnnualincome()>500000 && ld.getAnnualincome()<=1000000) {
    			loan_amt=2500000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		else if(ld.getAnnualincome()>1000000) {
    			loan_amt=4500000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		
    	
    	}
		else if (ld.getAge()>50 && ld.getAge()<60) {
    		double intrate=10.0/12/100;
    		if(ld.getAnnualincome()>300000 && ld.getAnnualincome()<=500000){
    			loan_amt=1000000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		else if(ld.getAnnualincome()>500000 && ld.getAnnualincome()<=1000000) {
    			loan_amt=2000000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		else if(ld.getAnnualincome()>1000000) {
    			loan_amt=4000000;
    			tenure=(60-ld.getAge());
    			emi=(loan_amt*intrate*Math.pow(1+intrate, tenure))/(Math.pow(1+intrate,tenure-1));
    		}
    		
    	}
		 else {
		    	return"wrong input";
		    }
  
		return "your loan amount is" +" "+ Double.toString(loan_amt)+"              "+
  		 "your tenure is"+" "+Double.toString(tenure) +"years"+ "     " +" your emi is "+ "   "+Double.toString(emi);
	}
}
