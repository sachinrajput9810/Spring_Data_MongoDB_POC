package com.nt.service;

import java.util.List;

import com.nt.document.Player;

public interface ISportsMgmtService {
	public String registerPlayerWithSportAndMedal(Player player) ;
	public List<Player> fetchAllPlayer() ;
}
