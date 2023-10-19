package com.ambula_CL.ambula_CL;

import org.springframework.beans.factory.annotation.Autowired;

public class MatchServiceImpl implements MatchServiceInt{
	
	@Autowired
	private MatchRepo matchservice;
	

	@Override
	public Match addMatch(Match match) {
		// TODO Auto-generated method stub
		return matchservice.save(match);
	}

	@Override
	public void deleteMatchbyid(int id) {
		// TODO Auto-generated method stub
		
		matchservice.deleteById(id);
		
	}

	@Override
	public Match updateMatch(Match match) {
		// TODO Auto-generated method stub
		return null;
	}

}
