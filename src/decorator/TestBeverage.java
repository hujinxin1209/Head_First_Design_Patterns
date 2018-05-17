package decorator;

public class TestBeverage {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2); // Mocha装饰
		beverage2 = new Mocha(beverage2); // 用第二个Mocha装饰
		beverage2 = new Whip(beverage2); // 用Whip装饰
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
	}
}
