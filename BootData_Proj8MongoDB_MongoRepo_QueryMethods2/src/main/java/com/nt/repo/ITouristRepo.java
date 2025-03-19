package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Tourist;
import java.util.List;
import java.util.Optional;


public interface ITouristRepo extends MongoRepository<Tourist, String> {
	
	@Query(value = "{nativePlace : { $regex:?0 }  }")
	public List<Tourist> getTouristByNativePlaceRegex(String nativePlace) ;	
	
	
	@Query(value = "{ age:{$gte:?0 , $lte:?1 }  } " , count = true)
	public int getTouristCountByAgeRange(int start , int end) ;
	
	
	@Query(value = "{}" , sort = "{ touristName : 1 }")
	public List<Tourist> getTouristsSortedByTouristName() ;
	
	@Query(value = "{ contactNo:null}" , delete = true )
	public List<Tourist> deleteTouristWithNoContactNumber() ;
	
	@Query(value = "{ isVaccinated : false }" , exists = true)
	public boolean AnyTouristWithoutVaccination() ;
	
}