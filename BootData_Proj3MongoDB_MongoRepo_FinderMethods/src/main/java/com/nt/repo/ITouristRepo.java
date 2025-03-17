package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Tourist;
import java.util.List;
import java.util.Optional;


public interface ITouristRepo extends MongoRepository<Tourist, String> {
	public Optional<Tourist>  findById(String id);
	public List<Tourist> findByNativePlaceOrderByAgeAsc(String nativePlace);
}
