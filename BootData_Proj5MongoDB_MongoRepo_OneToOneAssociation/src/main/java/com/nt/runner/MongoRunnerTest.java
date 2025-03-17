package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.document.PersonInfo;
import com.nt.document.Tourist;
import com.nt.service.IPersonMgmtService;
import com.nt.service.IRTOServiceMgmt;

@Component
public class MongoRunnerTest implements CommandLineRunner{

	@Autowired
	private IRTOServiceMgmt service ;
 	
	@Override
	public void run(String... args) throws Exception {
		
//		try {
//			Person person = new Person("Richa", "Gujrat") ;
//			DrivingLicense license = new DrivingLicense(555555l, "4 -Wheeler", LocalDate.now()) ;
//			person.setLicense(license);
//			System.out.println(service.registerPersonWithDrivingLicense(person)) ;
//			
//			System.out.println("--------------------------------");
//			service.fetchAllPerson().forEach(per -> {
//				System.out.println("parent :: " + per) ;
//				DrivingLicense lic = person.getLicense() ;
//				System.out.println("child license :: " + lic) ;
//			});
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			DrivingLicense license = new DrivingLicense(555555l, "Tractor-license", LocalDate.of(2029, 10, 31)) ;
			Person person = new Person("Jamana", "Agartala") ;
			license.setPersonDetails(person);
			
			System.out.println(service.registerLicenseWithPerson(license) ) ;
			System.out.println("============================") ;
			service.fetchAllLicense().forEach(lic -> {
				System.out.println("lic (parent) :: " + lic ) ;
				Person per = lic.getPersonDetails() ;
				System.out.println("Person (child)  :: " + per) ;
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
