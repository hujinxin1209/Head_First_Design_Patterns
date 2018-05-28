package adapter;

public class DuckTest {
	public static void main(String[] args) {
	    WildTurkey turkey = new WildTurkey();
		Duck duckAdapter = new TurkeyAdapter(turkey);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.quack();
			duckAdapter.fly();
		}
	}
}
