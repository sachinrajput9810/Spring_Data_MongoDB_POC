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
	public List<Tourist> fetchTouristsByNativePlace(String nativePlace) {
		return repo.getTouristByNativePlaceRegex(nativePlace) ;	
				
	}

	@Override
	public int countTourist(int start, int end) {
		return repo.getTouristCountByAgeRange(start, end) ;
	}

	@Override
	public List<Tourist> fetchTouristByTouristName() {
		return repo.getTouristsSortedByTouristName() ;
	}

	@Override
	public List<Tourist> fetchTouristByContactNo() {
		return repo.deleteTouristWithNoContactNumber() ;
	}

	@Override
	public Boolean checkUnvaccinatedTourist() {
		return repo.AnyTouristWithoutVaccination() ;
	}
	

}
