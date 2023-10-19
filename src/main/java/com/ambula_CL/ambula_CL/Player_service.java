package com.ambula_CL.ambula_CL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Player_service implements PlayerServiceInt {
	
	@Autowired
	private PlayerRepo playerrepo;

	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerrepo.save(player);
	}

	@Override
	public void deleteByPlayerId(int id) {
		// TODO Auto-generated method stub
		playerrepo.deleteById(id);
		
	}

	@Override
	public Optional<Player> getByPlayerId(int id) {
		// TODO Auto-generated method stub
		return playerrepo.findById(id);
	}

	@Override
	public List<Player> getallplayer() {
		// TODO Auto-generated method stub
		return playerrepo.findAll();
	}


	

}
