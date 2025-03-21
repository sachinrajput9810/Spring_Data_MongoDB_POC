package com.nt.service;

import java.util.List;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;

public interface IRTOServiceMgmt {
	public String registerPersonWithDrivingLicense(Person person) ;
	public String registerLicenseWithPerson(DrivingLicense license) ;

	public List<Person> fetchAllPerson() ;
	public List<DrivingLicense> fetchAllLicense() ;

}
