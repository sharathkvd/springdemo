package com.demo.service;

import java.util.List;

import com.demo.bean.Pensioner;


public interface PensionerService {

	// GET procession service
	Pensioner processPension(Pensioner Pensioner);
	// GET procession service
	List<Pensioner> listOfPensioner();

}
