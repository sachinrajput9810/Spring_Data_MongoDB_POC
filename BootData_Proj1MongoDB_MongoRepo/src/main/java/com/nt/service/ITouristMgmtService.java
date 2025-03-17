package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.Tourist;

public interface ITouristMgmtService {
	public String registerTourist(Tourist tourist) ; 
	public List<Tourist> fetchAllToursit() ;
	public List<Tourist> saveAllTourists(List<Tourist> tourists) ;
	public List<Tourist> fetchAllSortedTourists(boolean asc , String... props) ;
	public Optional<Tourist> fetchTouristById(String id) ;
	public String modifyTouristById(String id , Long newContactNo) ;
	public String removeTouristById(String id) ;
}
