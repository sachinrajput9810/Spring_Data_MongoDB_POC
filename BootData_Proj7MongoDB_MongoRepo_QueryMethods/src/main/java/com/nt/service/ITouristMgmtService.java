package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.Tourist;

public interface ITouristMgmtService {
	public List<Tourist> fetchAllTouristByNativePlaceAndAge(String  nativePlace , Float age) ;
	public List<Tourist> fetchTouristByAgeRange(Float start , Float end) ;
	public List<Tourist> fetchTouristByPlace(String place1 , String place2) ;
	public List<Object[]> fetchTouristDetailsByPlace(String place) ;
}