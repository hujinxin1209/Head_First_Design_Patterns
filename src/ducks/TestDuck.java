package ducks;

public class TestDuck {
	public static void main(String[] args) {
		Duck maller = new MallerDuck();
		maller.setFlyBehavior(new FlyWithWings());
		maller.setQuackBehavior(new MuteQuack());
		maller.performFly();
		maller.performQuack();
	}
}
