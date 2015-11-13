
public class Concert {

	// create a chorus
	// let them perform a song
	// create an object hierarchy representing
	// six objects
	// class extensions
	// tenor, extends singer, extends person
	// members and candidates
	// perform is writing some lyrics in the output
	// println(Ramon : "Well you rock my soul in the bossom of abrahma."
	// println(THorsten: "Well you rock my soul in the bossom of abrahma."
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
		Director musical_director01 = new Director("Hans-Jürgen", new Song[]{song01, song02, song03, song04, song05, song06, song07, song08, song09, song10});		
				
		// create Singer objects
		// Singer 1 is a deep voiced ballad singer
		Singer singer01 = new Singer(Section.BASS, "Richard", new Song[]{song01,song02,song03,song09});	
		
		// Singer 2 is a deep voiced spiritual music singer
//		Singer singer02 = new Singer("Bass");		
//		singer02.repertoire[0] = song04;
//		singer02.repertoire[1] = song09;
//		singer02.repertoire[2] = song10;
		// Singer 3 is a Baritone who likes secular ballads
//		Singer singer03 = new Singer("Bari");		
//		singer03.repertoire[0] = song01;
//		singer03.repertoire[1] = song02;
//		singer03.repertoire[2] = song03;
		// Singer 4 is a Bari who likes secular up tempos
//		Singer singer04 = new Singer("Bari");
//		singer04.repertoire[0] = song05;
//		singer04.repertoire[1] = song06;
//		singer04.repertoire[2] = song07;
//		singer04.repertoire[3] = song08;
		// SInger 5 is a Lead who sings anything
//		Singer singer05 = new Singer("Lead");		
//		singer05.repertoire = musical_director.repertoire;
		// Singer 6 is a Lead who sings only german songs
//		Singer singer06 = new Singer("Lead");
//		singer06.repertoire[0] = song05;
//		singer06.repertoire[1] = song07;
		// Singer 7 is a high voice who sings everything that singer 3 sings
//		Singer singer07 = new Singer("Tenor");
//		singer07.repertoire = singer03.repertoire;
		// Singer 8 is a high voice who sings everything that singer 1 sings
//		Singer singer08 = new Singer("Tenor");
//		singer08.repertoire = singer01.repertoire;
		// create Audience objects
//		Guest audience01 = new Guest(1);		
//		Guest audience02 = new Guest(2);
//		Guest audience03 = new Guest(3);
//		Guest audience04 = new Guest(4);
//		Guest audience05 = new Guest(5);
//		Guest audience06 = new Guest(6);

		
		// perform a concert of a chorus
		// concert.perform(); OR perform(chorus,audience);
		//concert.perform();
	}	

}


