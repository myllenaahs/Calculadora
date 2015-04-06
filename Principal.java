import java.util.Scanner;

public class Principal {
	
	public static void main (String[]args){
		Scanner key = new Scanner (System.in);
		
		int v1,v2;
		String op;
		
		v1=key.nextInt();
		op=key.next();
		v2=key.nextInt();
		
		switch (op) {
			case "+": {
				System.out.println(v1+v2);
				break;
			}
			case "-": {
				System.out.println(v1-v2);
				break;
			}
			case "*": {
				System.out.println(v1*v2);
				break;
			}
			case "/": {
				System.out.println(v1/v2);
				break;
			}
			
		}
		
		
	}

}
