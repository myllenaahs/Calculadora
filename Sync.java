import java.util.Scanner;

public class Sync  implements Runnable{
	
	Scanner key = new Scanner(System.in);

	private int x, y;
	private String operador;
	

	public void run(){
		
		this.read();
		
	}
	
	private synchronized void read(){
			
		this.x = key.nextInt();
		this.operador = key.next();
		this.y = key.nextInt();
		
	}
	
	public synchronized int calculate(){
		
		Calc c = new Calc();
		
		return c.calculando(x, operador, y);
		
	}
}