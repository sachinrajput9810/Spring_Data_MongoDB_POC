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
	public String registerTourist(Tourist tourist) {
		return repo.save(tourist).getId() + " is registered";
	}

	

}
