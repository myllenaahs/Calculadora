
import java.util.Scanner;

public class calcTeste {
	public static void main (String [] args){
		
		double resul = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n------------------Calculadora--------------------\n");
		
		System.out.print("Escreva o primeiro valor: ");
			double a=in.nextDouble();
			
		System.out.print("Escreva a operação: ");
			String op=in.next();
		
		System.out.print("Escreva o segundo valor: ");
			double b=in.nextDouble();
		
				switch (op) {
				
					case "-" : resul= a-b;
						break;
					
					case "+" : resul= a+b;
						break;
					
					case "/" : resul= a/b;
						break;
					
					case "*" : resul= a*b;
						break;
				
				
				}
		
		System.out.println("\nResultado: " +resul);
		//testando
		
	}

}
