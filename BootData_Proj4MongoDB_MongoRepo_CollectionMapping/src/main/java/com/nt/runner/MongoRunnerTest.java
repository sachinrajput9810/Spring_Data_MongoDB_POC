package com.nt.runner;

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

import com.nt.document.PersonInfo;
import com.nt.document.Tourist;
import com.nt.service.IPersonMgmtService;

@Component
public class MongoRunnerTest implements CommandLineRunner{

	@Autowired
	private IPersonMgmtService service ;

	@Override
	public void run(String... args) throws Exception {
		Properties props = new Properties() ;
		props.put("Addhar", 434532244) ;
		props.put("VoterID", 99933344) ;
		PersonInfo info = new PersonInfo(null, "Shambhu", "Banaras",
						  new String[] {"pink" , "blue", "green"},
						  List.of("Raj" , "Rohan" , "Shreya"), 	
						  Set.of(9999999l , 5555555l , 66666444l), 
						  Map.of("SBI" , 475383822L , "Canara" , 84859392l), 
						  props) ;
		System.out.println(service.registerPersonInfo(info));
	}
	
}
