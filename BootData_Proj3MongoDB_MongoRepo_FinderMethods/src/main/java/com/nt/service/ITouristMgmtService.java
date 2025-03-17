package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.Tourist;

public interface ITouristMgmtService {
	public Optional<Tourist> fetchTouristById(String id) ;
	public List<Tourist> fetchTouristByNativePlace(String place) ;
}
