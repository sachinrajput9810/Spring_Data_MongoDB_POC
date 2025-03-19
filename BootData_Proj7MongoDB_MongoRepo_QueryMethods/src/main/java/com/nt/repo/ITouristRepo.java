package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Tourist;
import java.util.List;
import java.util.Optional;


public interface ITouristRepo extends MongoRepository<Tourist, String> {
	
//	@Query(fields = "{}" , value = "{nativePlace:?0}")
//	public List<Tourist> getTouristsByNativePlace(String nativePlace) ;
	
	@Query( value = "{ nativePlace:?0 , age:{$gte:?1}   }")
	public List<Tourist> getTouristsByNativePlaceAndAge(String nativePlace , Float age) ;
	

	@Query( value = "{ age:{$gte:?0 , $lte:?1}   }")
	public List<Tourist> getTouristsByAgeRange(Float startAge , Float endAge) ;
	
	@Query(value = "{ $or:[ {nativePlace:?0} , {nativePlace:?1} ] }")
	public List<Tourist> getTouristByPlace(String place1, String place2);
	
//  Projections
	
	@Query(fields = "{touristName:1 , nativePlace:1 , age:1}" ,  value = "{nativePlace:?0}" )
	public List<Object[]> getTouristByNativePlace(String nativePlace) ;


	
	
	
}