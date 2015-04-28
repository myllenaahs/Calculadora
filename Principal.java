import java.util.Scanner;
import java.io.*;

public class Principal {
	public static void main(String[]args) throws IOException{
		Scanner key = new Scanner(System.in);
		
		double v1,v2,result;
		String op;
		result=0;
		
		v1=key.nextDouble();
		op=key.next();
		v2=key.nextDouble();
		
		
		
		FileWriter arq = new FileWriter("resultado.txt"); 
		PrintWriter gravarArq = new PrintWriter(arq);
		
		switch (op){
		case "+":{
			result=v1+v2;
			gravarArq.printf("Operação: "+v1+" + "+v2+" = "+result);
			System.out.println(v1+" + "+v2+" = "+result);
			break;
		}
		case "-":{
			result=v1-v2;
			gravarArq.printf("Operação: "+v1+" - "+v2+" = "+result);
			System.out.println(v1+" - "+v2+" = "+result);
			break;
		}
		case "*":{
			result=v1*v2;
			gravarArq.printf("Operação: "+v1+" * "+v2+" = "+result);
			System.out.println(v1+" * "+v2+" = "+result);
			break;
		}
		case "/":{
			result=v1/v2;
			gravarArq.printf("Operação: "+v1+" / "+v2+" = "+result);
			System.out.println(v1+" / "+v2+" = "+result);
			break;
		}
		}
		
		arq.close();

	}
}
