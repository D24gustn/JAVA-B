package ReStart04.Animal;

import static ReStart03.Circle.PI;

import ReStart03.Circle;

public class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
	}

	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}
}