package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private int Id;
	
	private String playerName;
	
	@OneToMany
	private List<Team> team;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public List<Team> getTeam() {
		return team;
	}
	public void setTeam(List<Team> team) {
		this.team = team;
	}

}
