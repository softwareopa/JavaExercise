
public class Guest extends Person {
	private int seat;
	

	public Guest(int seat, String name) {
		super(name);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
}

