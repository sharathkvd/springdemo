package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Pensioner;

import com.demo.repo.PensionserRepo;
import com.demo.service.PensionerService;

@Service
public class PensionerServviceImpl implements PensionerService{
	
	@Autowired
	PensionserRepo pensionrepo;
	@Override
	public Pensioner processPension(Pensioner Pensioner) {
		Pensioner addpensioner = pensionrepo.save(Pensioner);

		return addpensioner; // returning to controler
		
	}
	@Override
	public List<Pensioner> listOfPensioner() {
		List<Pensioner> listOfPensioner = pensionrepo.findAll();// select * from tablename

		return listOfPensioner;
	}

	
}
