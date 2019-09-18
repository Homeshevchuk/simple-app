package entities;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	private int power;

	public Car() {
	}

	public Car(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
