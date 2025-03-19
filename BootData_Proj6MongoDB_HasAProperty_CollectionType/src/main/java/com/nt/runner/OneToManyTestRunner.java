package com.nt.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medal;
import com.nt.document.Player;
import com.nt.document.Sport;
import com.nt.service.ISportsMgmtService;

@Component
public class OneToManyTestRunner implements CommandLineRunner {

	@Autowired
	private ISportsMgmtService service ;
	
	@Override
	public void run(String... args) throws Exception {
//		Sport sport1 = new Sport(new Random().nextInt(1000), "Cricket", new String[] {"Bat" , "ball" , "wicket" , "L-Gaurd"} ) ;
//		Sport sport2 = new Sport(new Random().nextInt(1000), "Golf", new String[] {"Golf stick" , "Ball"}) ;
//		
//		Medal medal1 = new Medal(new Random().nextInt(1000), "Champions trophy", "ODI WC", "Pakistan and Dubai") ;
//		Medal medal2 = new Medal(new Random().nextInt(1000), "T20 World Cup", "T20 WC", "India") ;
//		
//		Player player = new Player(null, "Santner", "New Zealand", Set.of(sport1,sport2), Map.of("Medal1" , medal1 , "Medal2" , medal2)) ;
//		System.out.println(service.registerPlayerWithSportAndMedal(player));
		
		service.fetchAllPlayer().forEach(player ->{
			System.out.println("Parent :: Player " + player);
			Set<Sport> sports = player.getSports() ;
			for(Sport sport : sports) {
				System.out.println("child1 :: sport " + sport );
			}
			Map<String , Medal> medals = player.getMedals() ;
			medals.forEach( (type , medal) -> {
				System.out.println("child2 :: " + type + "---" + medal);
			}) ;
			
		});
	}

}





