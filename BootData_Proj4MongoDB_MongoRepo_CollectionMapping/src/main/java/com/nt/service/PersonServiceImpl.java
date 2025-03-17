package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.PersonInfo;
import com.nt.document.Tourist;
import com.nt.repo.IPersonInfoRepo;

@Service("service")
public class PersonServiceImpl implements IPersonMgmtService {

	@Autowired
	private IPersonInfoRepo repo ;

	@Override
	public String registerPersonInfo(PersonInfo info) {
		return repo.save(info).getId() + " is saved" ;
	}


}
