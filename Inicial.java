import java.util.Scanner;

public class Inicial {
	public static void main (String []args){
		
		Scanner in = new Scanner(System.in);
		
		int a, b, res=0;
		String op;
		Calc calc = new Calc();

		a = in.nextInt();
		op = in.next();
		b = in.nextInt();

		switch (op) {
		case "+": {
			res = calc.soma(a, b);
			break;
		}
		case "-": {
			res = calc.subtracao(a, b);
			break;
		}
		case "*": {
			res = calc.multiplicacao(a, b);
			break;
		}
		case "\\": {
			res = calc.divisao(a, b);
		}
		}
		
		System.out.println(a+" "+op+" "+b+" = "+res+"   \n");
		
	}

}
