package com.schalleck.chorus.model;

import java.util.ArrayList;
import java.util.List;


public class Person {
	
	//TODO: Create set and getter for repertoire
	
	private String name;
	private ArrayList<Song> repertoire = new ArrayList<Song>();

	public Person(String name, ArrayList<Song> repertoire) {
		super();
		this.name = name;
		this.repertoire = repertoire;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public ArrayList<Song> getRepertoire() {
		return repertoire;
	}

	public void setRepertoire(ArrayList<Song> repertoire) {
		this.repertoire = repertoire;
	}
}
