public class Principal {

	public static void main(String[] args) {
		
		Sync t = new Sync();
		
		do{
			
			t.run();
			
			System.out.println(t.calculate());
			
		} while(true);
	}
}
