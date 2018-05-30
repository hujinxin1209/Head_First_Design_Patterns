package templatemethod.barista;

public class TestTemplateMethod {
	public static void mian(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("\nMaking tea...");
		tea.prepareReciepe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareReciepe();
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareReciepe();
	}
}
