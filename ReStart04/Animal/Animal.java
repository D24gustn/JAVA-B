package ReStart04.Animal;

public class Animal {
	private String eye;
	protected String mouth;
	
	public void eat() {
		System.out.println("먹이를 먹는다.");
	}
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	
	public String getEye() {
		return eye;
	}
	public void setEye(String eye) {
		this.eye = eye;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	
	
	
	
}
