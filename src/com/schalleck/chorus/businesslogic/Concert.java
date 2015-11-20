package com.schalleck.chorus.businesslogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.schalleck.chorus.model.Chorus;
import com.schalleck.chorus.model.Section;
import com.schalleck.chorus.model.Singer;
import com.schalleck.chorus.model.Song;

public class Concert implements ConcertInterface {
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

	/* (non-Javadoc)
	 * @see com.schalleck.chorus.businesslogic.ConcertInterface#perform()
	 */
	@Override
	public void perform() {
		// Welcome to the Concert : concertname of the chorus chorusname.
		
		System.out.println(String.format("Welcome to %s's %s!",chorus.getName(), concert_name));
		
		// Directed by musicaldirector. Performed by singer_name singers.
		System.out.println(String.format("Directed by %s.",chorus.getDirector().getName()));		
			
		// print all songs where the director and at least 1 singer of each section has the song in the reprtoire along with the name of the performers
		
		// Loop through all Songs of the director
		for(Song song : chorus.getDirector().getRepertoire()) {
			perform(song);	
		}
	}
	
	/* (non-Javadoc)
	 * @see com.schalleck.chorus.businesslogic.ConcertInterface#perform(com.schalleck.chorus.model.Song)
	 */
	@Override
	public void perform(Song song){		
		
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ... use perform(Song)		
		
		//Singer[] performers = new Singer[10];
		ArrayList<Singer> performers = new ArrayList<Singer>();
		
		// Hash to store the Section of the singers that have the song in their repertoire
		Map<Enum, Boolean> sections = new HashMap<Enum, Boolean>();
		//Loop through all singers
		for(Singer current_singer : chorus.getChorus()){
			//loop through repertoire of singer
			for(Song song_from_current_singer : current_singer.getRepertoire()){
				// Check if the singer can sing the song
				if(song_from_current_singer.equals(song)){
					//
					// TODO: Make sure the Song Titles are unique
					// put singer into a hash of performers
					performers.add(current_singer);
					// Add the section to the hash of sections
					sections.put(current_singer.getSection(), true); 
				}
			}			
		}
		
		// TODO: The two programm parts could be put into seperate methods
		// song_check()
		// publish_performance();
		
		// Check if there is at least one singer of each section who has the song in the repertoire	
		publishPerformance(song, performers, sections);
		// "Rock my Soul" : BASS : Richard Rudi LEAD: Terry Heiner BARITONE: ...
		// or if the song cannot be performed
		// print "It cannot be perfomred"
	}

	private void publishPerformance(Song song, ArrayList<Singer> performers, Map<Enum, Boolean> sections) {
		if(sections.size() >= Section.values().length){ 			
			// print out song title
			System.out.print(String.format("\"%s\"",song.getTitle()));
			// Loop through Singer who know the song
			for(Singer current_performer : performers){
				// print Section, Name of singer who has the song in the repertoire				
					System.out.print(String.format(" : %s : %s",current_performer.getSection(),current_performer.getName()));
			}	
			System.out.println();
		}
		else{
			System.out.println(String.format("\"%s\" : It cannot be performed",song.getTitle()));
		}
	}
}


