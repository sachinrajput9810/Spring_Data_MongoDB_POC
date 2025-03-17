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

	@Override
	public List<Tourist> fetchAllToursit() {
		return repo.findAll();
	}

	@Override
	public List<Tourist> saveAllTourists(List<Tourist> tourists) {
		return repo.saveAll(tourists);
	}

	@Override
	public List<Tourist> fetchAllSortedTourists(boolean asc, String... props) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, props) ;
		return repo.findAll(sort);
	}

	@Override
	public Optional<Tourist> fetchTouristById(String id) {
		return repo.findById(id) ;
	}

	@Override
	public String modifyTouristById(String id, Long newContactNo) {
		Optional<Tourist> opt = repo.findById(id) ;
		if(opt.isEmpty()) return "Tourist not found" ;
		Tourist tourist = opt.get() ;
		tourist.setContactNo(newContactNo);
		repo.save(tourist) ;
 		return "User has been updated" ;
	}

	@Override
	public String removeTouristById(String id) {
		repo.deleteById(id);
		return "Tourist with " + id + " is deleted" ;
	}

}
