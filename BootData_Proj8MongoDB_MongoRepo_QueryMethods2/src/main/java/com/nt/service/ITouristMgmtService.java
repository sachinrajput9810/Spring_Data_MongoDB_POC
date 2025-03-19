package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.Tourist;

public interface ITouristMgmtService {
	public List<Tourist> fetchTouristsByNativePlace(String nativePlace) ;
	public int countTourist(int start , int end) ;
	public List<Tourist> fetchTouristByTouristName() ;
	public List<Tourist> fetchTouristByContactNo() ;
	public Boolean checkUnvaccinatedTourist() ;
}