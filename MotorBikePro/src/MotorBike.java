
public class MotorBike {
	// state
	private int speed; // member var

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	void start() {
		System.out.println("Bike started");
	}
}
