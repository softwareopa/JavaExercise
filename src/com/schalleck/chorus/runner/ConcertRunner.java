package com.schalleck.chorus.runner;

import com.schalleck.chorus.businesslogic.Concert;
import com.schalleck.chorus.model.Chorus;
import com.schalleck.chorus.model.Director;
import com.schalleck.chorus.model.Section;
import com.schalleck.chorus.model.Singer;
import com.schalleck.chorus.model.Song;

public class ConcertRunner {

	public ConcertRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		// create objects of Songs		
	    // TODO: Create COncertRUnner, create concert with elements call concert.perform 
		Song song01 = new Song("Change the World");
		Song song02 = new Song("If");
		Song song03 = new Song("Lullabye");
		Song song04 = new Song("Rock my Soul");
		Song song05 = new Song("YMCA");
		Song song06 = new Song("Sound of Munich");
		Song song07 = new Song("Laß mich dein Badewasser schlürfen");
		Song song08 = new Song("Old black magic");
		Song song09 = new Song("Oh love");
		Song song10 = new Song("Get happy");	
		
		// create Director object
		// Director Hans Jürgen has the full repertoire 
		Director musical_director = new Director("Hans-Jürgen", new Song[]{song01, song02, song03, song04, song05, song06, song07, song08, song09, song10});		
				
		// create Singer objects
		// Singer 1 is a deep voiced ballad singer
		Singer singer01 = new Singer(Section.BASS, "Richard", new Song[]{song01,song02,song03,song09});	
		Singer singer02 = new Singer(Section.BASS, "Sikanda", new Song[]{song04,song09,song10});
		Singer singer03 = new Singer(Section.BARITONE, "Holger", new Song[]{song01,song02,song03});
		Singer singer04 = new Singer(Section.BARITONE, "Joseph", new Song[]{song05,song06,song07,song08});
		Singer singer05 = new Singer(Section.LEAD, "Terry", musical_director.getRepertoire());
		Singer singer06 = new Singer(Section.LEAD, "Joseph", new Song[]{song05,song07});
		Singer singer07 = new Singer(Section.TENOR, "Joseph", singer03.getRepertoire());
		Singer singer08 = new Singer(Section.TENOR, "Joseph", singer01.getRepertoire());
		
		// Create Chorus
		Chorus chorus = new Chorus("Herrenbesuch", musical_director, new Singer[]{singer01,singer02,singer03,singer04,singer05,singer06,singer07,singer08});
			
		
		// TODO Auto-generated method stub
		// perform a concert of a chorus
		// concert.perform(); OR perform(chorus,audience);
		Concert concert = new Concert("Jahreskonzert", chorus);
		concert.perform();
	}

}
