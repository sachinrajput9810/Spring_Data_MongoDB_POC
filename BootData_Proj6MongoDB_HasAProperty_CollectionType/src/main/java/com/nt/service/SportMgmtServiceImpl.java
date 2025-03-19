package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repo.IMedalRepo;
import com.nt.repo.IPlayerRepo;
import com.nt.repo.ISportRepo;

@Service("sportService")
public class SportMgmtServiceImpl implements ISportsMgmtService {

	@Autowired
	private IPlayerRepo playerRepo ;
	@Autowired
	private IMedalRepo medalRepo ;
	@Autowired
	private ISportRepo sportRepo ;
	
	@Override
	public String registerPlayerWithSportAndMedal(Player player) {
		return playerRepo.save(player).getPid() + " is registered " ;
	}

	@Override
	public List<Player> fetchAllPlayer() {
		return playerRepo.findAll() ;
	}

}
