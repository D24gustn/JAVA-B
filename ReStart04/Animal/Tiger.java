package ReStart04.Animal;

import ReStart04.Animal;

public class Tiger extends Animal {
	private String leg;
	
	public String getLeg() {
		return leg;
	}
	
	public void setLeg(String leg) {
		this.leg = leg;
	}
	
	public void run() {
		mouth = "입";
		System.out.println("달린다.");
	}
	
	public void eat() {
		System.out.println("고기를 먹는다.");
	}
}
