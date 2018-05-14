package ducks;

public class Quack implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Quack !!");
	}

}
