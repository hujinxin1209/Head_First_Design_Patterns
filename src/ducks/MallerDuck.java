package ducks;

public class MallerDuck extends Duck {
	public MallerDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("I am a real Maller duck!");	
	}
	
}
