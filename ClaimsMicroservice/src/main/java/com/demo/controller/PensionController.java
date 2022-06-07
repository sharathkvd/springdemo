package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Pensioner;
import com.demo.service.PensionerService;


@RestController
@RequestMapping("/api/")
public class PensionController {
	
	@Autowired
	private PensionerService pensionservice;
	
	// create service for admin
		@PostMapping(value = "/createproduct") // endpoint
	public	ResponseEntity<Pensioner> createProduct(@Valid @RequestBody Pensioner prod) {
			Pensioner p = pensionservice.processPension(prod);// calling service from controller
			return new ResponseEntity<Pensioner>(p, HttpStatus.CREATED);

		}

		// api
		// get method
		@GetMapping(value = "/listofproducts")
		List<Pensioner> listOfPensioner() {

			List<Pensioner> listofpension = pensionservice.listOfPensioner();

			return listofpension;

		}

}
