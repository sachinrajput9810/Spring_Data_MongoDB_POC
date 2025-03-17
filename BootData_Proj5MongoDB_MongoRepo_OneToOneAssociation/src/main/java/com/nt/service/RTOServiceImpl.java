package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.repo.IDrivingLicenseRepo;
import com.nt.repo.IPersonRepo;

@Service("RTOservice")
public class RTOServiceImpl implements IRTOServiceMgmt {

	@Autowired
	private IPersonRepo personRepo ;
	@Autowired
	private IDrivingLicenseRepo licenseRepo ;
	
	@Override
	public String registerPersonWithDrivingLicense(Person person) {
		return "Person with " + personRepo.save(person).getId() + " is saved" ;
	}

	@Override
	public List<Person> fetchAllPerson() {
		return personRepo.findAll() ;
	}

	@Override
	public String registerLicenseWithPerson(DrivingLicense license) {
		return "License with " + licenseRepo.save(license).getId() + " is saved" ;
	}

	@Override
	public List<DrivingLicense> fetchAllLicense() {
		return licenseRepo.findAll() ;
	}

}
