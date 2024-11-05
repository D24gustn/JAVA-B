package ReStart04.Animal;

import ReStart04.Animal;

public class Goldfish extends Animal {
	private String fin;
	
	public void swim() {
		System.out.println("헤엄친다.");
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	public void eat() {
		System.out.println("플랑크톤을 먹는다.");
	}
	
}
