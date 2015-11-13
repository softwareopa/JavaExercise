package com.schalleck.chorus.model;

public class Singer extends Person{	
		
	private Section section;
	//TODO: Transform section into ENum object Tenor, Bass, Lead, Baritone String :
	public Singer(Section section, String name, Song[] repertoire) {
		super(name, repertoire);
		this.section = section;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}
