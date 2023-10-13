package code.test.viji.oops;

public class ToyotaInnova extends Toyota {
	
	private int seats = 7;

	public ToyotaInnova() {
	}

	public ToyotaInnova(String name) {
		super(name);
	}

	public ToyotaInnova(String name, int no) {
		super(name, no);
	}
	
	

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "ToyotaInnova [seats=" + seats + ", toString()=" + super.toString() + "]";
	}




}
