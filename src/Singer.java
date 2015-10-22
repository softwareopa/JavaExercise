
public class Singer extends Person{	
		
	private String section;
	//TODO: Transform section into ENum object Tenor, Bass, Lead, Baritone String :
	public Singer(String section, String name) {
		super(name);
		this.section = section;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
}
