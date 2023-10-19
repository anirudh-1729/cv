package com.ambula_CL.ambula_CL;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate DOB;
	
//	@JsonFormat(shape = JsonFormat.Shape.STRING)
//	private int MatchId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@ManyToOne
    @JoinColumn(name = "match_id", referencedColumnName = "id")
    private Match match;
	
	public Player() {
		
	}
	
	
	public Player(int id, String name, LocalDate dOB) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	
	public Match getMatch() {
	    return match;
	}

	public void setMatch(Match match) {
	    this.match = match;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", DOB=" + DOB + ", MatchId=" + match.getId() + "]";
	}
	
	
	

}
