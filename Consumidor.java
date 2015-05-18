
public class Consumidor {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		do{
			
			t.run();
			
			System.out.println(t.calculate());
			
		} while(true);
	}
}
