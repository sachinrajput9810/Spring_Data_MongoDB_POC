package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Tourist;
import com.nt.repo.ITouristRepo;

@Service("service")
public class TouristServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo repo ;

	

	@Override
	public List<Tourist> fetchAllTouristByNativePlaceAndAge(String nativePlace, Float age) {
		return repo.getTouristsByNativePlaceAndAge(nativePlace , age) ;
	}



	@Override
	public List<Tourist> fetchTouristByAgeRange(Float start, Float end) {
		return repo.getTouristsByAgeRange(start, end) ;
	}



	@Override
	public List<Tourist> fetchTouristByPlace(String place1, String place2) {
		return repo.getTouristByPlace(place1, place2) ;
	}



	@Override
	public List<Object[]> fetchTouristDetailsByPlace(String place) {
		return repo.getTouristByNativePlace(place) ;
	}
	
	



	
	
	

}
