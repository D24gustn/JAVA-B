package ReStart04.Animal;

import ReStart04.Animal;

public class Eagle extends Animal {
	private String wing;

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}
	
	public void fly() {
		System.out.println("날아다닌다.");
	}
	
	public void eat() {
		System.out.println("고기를 먹는다.");
	}
}
