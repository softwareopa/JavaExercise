
public class Person {
	
	//TODO: Create set and getter for repertoire
	
	private String name;
	private Song[] repertoire = new Song[10];

	public Person(String name, Song[] repertoire) {
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
	
	
	public Song[] getRepertoire() {
		return repertoire;
	}

	public void setRepertoire(Song[] repertoire) {
		this.repertoire = repertoire;
	}
}
