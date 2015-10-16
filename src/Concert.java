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
		// List<String> supplierNames1 = new ArrayList<String>();
		Song song01 = new Song();
		song01.title = "Change the World";
		Song song02 = new Song();
		song02.title = "If";
		Song song03 = new Song();
		song03.title = "Lullabye";
		Song song04 = new Song();
		song04.title = "Rock my Soul";
		Song song05 = new Song();
		song05.title = "YMCA";
		Song song06 = new Song();
		song06.title = "Sound of Munich";
		Song song07 = new Song();
		song07.title = "Laß mich dein Badewasser schlürfen";
		Song song08 = new Song();
		song08.title = "Old black magic";
		Song song09 = new Song();
		song09.title = "Oh love";
		Song song10 = new Song();
		song10.title = "Get happy";
		// create Director object
		// DIrector has the same repertoire as the 
		Director musical_director = new Director();
		musical_director.repertoire[0] = song01;
		musical_director.repertoire[1] = song02;
		musical_director.repertoire[2] = song03;
		musical_director.repertoire[3] = song04;
		musical_director.repertoire[4] = song05;
		musical_director.repertoire[5] = song06;
		musical_director.repertoire[6] = song07;
		musical_director.repertoire[7] = song08;
		musical_director.repertoire[8] = song09;
		musical_director.repertoire[9] = song10;
		// create Singer objects
		// Singer 1 is a deep voiced ballad singer
		Singer singer01 = new Singer();
		singer01.section = "Bass";
		singer01.repertoire[0] = song01;
		singer01.repertoire[1] = song02;
		singer01.repertoire[2] = song03;
		singer01.repertoire[3] = song09;
		// Singer 2 is a deep voiced spiritual music singer
		Singer singer02 = new Singer();
		singer02.section = "Bass";
		singer02.repertoire[0] = song04;
		singer02.repertoire[1] = song09;
		singer02.repertoire[2] = song10;
		// Singer 3 is a Baritone who likes secular ballads
		Singer singer03 = new Singer();
		singer03.section = "Bari";
		singer03.repertoire[0] = song01;
		singer03.repertoire[1] = song02;
		singer03.repertoire[2] = song03;
		// Singer 4 is a Bari who likes secular up tempos
		Singer singer04 = new Singer();
		singer04.section = "Bari";
		singer04.repertoire[0] = song05;
		singer04.repertoire[1] = song06;
		singer04.repertoire[2] = song07;
		singer04.repertoire[3] = song08;
		// SInger 5 is a Lead who sings anything
		Singer singer05 = new Singer();
		singer05.section = "Lead";
		singer05.repertoire = musical_director.repertoire;
		// Singer 6 is a Lead who sings only german songs
		Singer singer06 = new Singer();
		singer06.section = "Lead";
		singer06.repertoire[0] = song05;
		singer06.repertoire[1] = song07;
		// Singer 7 is a high voice who sings everything that singer 3 sings
		Singer singer07 = new Singer();
		singer07.section = "Tenor";
		singer07.repertoire = singer03.repertoire;
		// Singer 8 is a high voice who sings everything that singer 1 sings
		Singer singer08 = new Singer();
		singer08.section = "Tenor";
		singer08.repertoire = singer01.repertoire;
		// create Audience objects
		Audience audience01 = new Audience();
		audience01.seat = 1;
		Audience audience02 = new Audience();
		audience02.seat = 2;
		Audience audience03 = new Audience();
		audience03.seat = 3;
		Audience audience04 = new Audience();
		audience04.seat = 4;
		Audience audience05 = new Audience();
		audience05.seat = 5;
		Audience audience06 = new Audience();
		audience06.seat = 6;
		
		// perform
		perform(singer01);
		perform(singer02);
		perform(singer03);
		perform(singer04);
		perform(singer05);
		perform(singer06);
		perform(singer07);
		perform(singer08);
	}
	private static Singer perform(Singer singer) {
		// Take the singer and get the title of his repertoire
		System.out.println(singer.repertoire[0].title);
		return(singer);
	}
}

class Person {
	String name;
}

class Audience {
	int seat;
	Song[] repertoire;
	
}

class Singer {
	String section;
	Song[] repertoire;
}

class Director {
	Song[] repertoire;
}

class Song {
	String title;
}

class Chorus {
	
}
