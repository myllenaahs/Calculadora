import java.io.IOException;
import java.util.Scanner;

public class Fornecedor {

	public static void main(String[] args) throws IOException {

		Scanner key = new Scanner(System.in);
		int valor1, valor2, res = 0, i=0;
		char op;

		do{
		valor1 = key.nextInt();
		op = key.next().charAt(0);
		valor2 = key.nextInt();
		
		Manipulador.escritor(valor1,valor2,op, getPID());
		i++;
		}while (i<6);

	}

	public static int getPID() {  
        String processName =  
                java.lang.management.ManagementFactory.getRuntimeMXBean().getName();  
        //System.out.println(processName);  
        return (int) Long.parseLong(processName.split("@")[0]);  
    } 
}
