package com.nt.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Tourist;
import com.nt.service.ITouristMgmtService;

@Component
public class MongoRunnerTest implements CommandLineRunner{

	@Autowired
	private ITouristMgmtService service ;
	
	@Override
	public void run(String... args) throws Exception {
		service.fetchTouristByNativePlace("Raipur").forEach(System.out::println);
	}
}
