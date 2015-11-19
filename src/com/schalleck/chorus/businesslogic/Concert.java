package com.schalleck.chorus.businesslogic;

import com.schalleck.chorus.model.Chorus;
import com.schalleck.chorus.model.Director;
import com.schalleck.chorus.model.Song;

public class Concert {
	private String concert_name;
	private Chorus chorus;
	
	// create a chorus
	// let them perform a song
	// create an object hierarchy representing
	// perform is writing some lyrics in the output
	// println(Ramon : "Well you rock my soul in the bossom of abrahma."
	// println(THorsten: "Well you rock my soul in the bossom of abrahma."
	public Concert(String concert_name, Chorus chorus) {		
		this.concert_name = concert_name;
		this.chorus = chorus;		
	}

	public void perform() {
		// TODO Auto-generated method stub
		// Welcome to the Concert : concertname of the chorus chorusname.
		
		System.out.println(String.format("Welcome to %s's %s!",chorus.getName(), concert_name));
		
		// Directed by musicaldirector. Performed by singer_name singers.
		System.out.println(String.format("Directed by %s.",chorus.getDirector().getName()));
		
		
		
		// print all songs where the director and at least 1 singer of each section has the song in the reprtoire along with the name of the performers
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ... use perform(Song)
		
	}
	
	public void perform(Song song){
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ...
		// or if the song cannot be performed
		// print "It cannot be perfomred"
	}
	
}


