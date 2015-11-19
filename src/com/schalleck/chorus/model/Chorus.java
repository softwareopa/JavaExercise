package com.schalleck.chorus.model;

/**
 * Represents a Chorus *Alt Shift 
 * Documentation about classes and interfaces
 */

public class Chorus {
	
	private String name;
	private Singer[] chorus = new Singer[8];
	private Director musical_director;
	public Chorus(String name, Director musical_director, Singer[] chorus) {
		super();
		this.name = name;
		this.chorus = chorus;
		this.musical_director = musical_director;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Singer[] getChorus() {
		return chorus;
	}

	public void setChorus(Singer[] chorus) {
		this.chorus = chorus;
	}
	public Director getDirector() {
		return musical_director;
	}

}
