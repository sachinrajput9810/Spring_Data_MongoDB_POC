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
		try {
			Tourist tourist = new Tourist() ;
			String id = UUID.randomUUID().toString() ;
			tourist.setId(id);
			tourist.setTouristName("Pappi");
			tourist.setAge(41.2f);
			tourist.setContactNo(999999911l);
			tourist.setPassportNo("AAAAA11111");
			tourist.setVisaExpiry(LocalDateTime.of(2027, 6, 1, 12, 0));
			System.out.println(service.registerTourist(tourist));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			List<Tourist> list = service.fetchAllToursit() ;
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Tourist tourist1 = new Tourist() ;
//			tourist1.setTouristName("Priyanka");
//			tourist1.setAge(33.f);
//			tourist1.setPassportNo("23FGD113");
//			
//			Tourist tourist2 = new Tourist() ;
//			tourist2.setTouristName("Ramu kaaka");
//			tourist2.setAge(55.3f);
//			tourist2.setIsVaccinated(true);
//			
//			List<Tourist> list = service.saveAllTourists(List.of(tourist1, tourist2)) ;
//			System.out.println("Tourist saved in db are :: ");
//			list.forEach(tourist -> {
//				System.out.println(tourist.getId() +" ");
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			List<Tourist> list = service.fetchAllSortedTourists(true, "age" , "touristName") ;
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Optional<Tourist> tourist = service.fetchTouristById("67d565185133e4464c375902w") ;
//		if(tourist.isPresent()) System.out.println("Tourist details :: " + tourist);
//		else System.out.println("Tourist not found");
		
//		String msg = service.modifyTouristById("67d568a5616e322f76c714da" , 9865789999L) ;
// 		System.out.println(msg);
		
//		String msg = service.removeTouristById("67d54905b7058844c130df2e") ;
//		System.out.println(msg);
		
	}
}
