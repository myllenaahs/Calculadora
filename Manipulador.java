import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulador {
	public static void escritor(int valor1, int valor2, char op, int pid) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter("arquivo.txt", true));

		int res =0;
		Calc calc = new Calc();
		
		switch (op) {
		case '+': {
			res = Calc.soma(valor1, valor2);
			System.out.println(res);
			break;
		}
		case '-': {
			res = Calc.subtrai(valor1, valor2);
			break;
		}
		case '*': {
			res = Calc.multiplica(valor1, valor2);
			break;
		}
		case '/': {
			res = Calc.divide(valor1, valor2);
		}
		}

		buffWrite.append(valor1 + " " + op + " " + valor2 + " = " + res + "   \n");
		buffWrite.close();
	}

	public static void leitor(String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

}
