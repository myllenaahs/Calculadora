import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulador {
	public static void escritor(String path) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(path, true));

		Scanner in = new Scanner(System.in);

		int a, b, res = 0;
		String op;
		Calc calc = new Calc();

		a = in.nextInt();
		op = in.next();
		b = in.nextInt();

		switch (op) {
		case "+": {
			res = calc.soma(a, b);
			System.out.println(res);
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

		buffWrite.append(a + " " + op + " " + b + " = " + res + "   \n");
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
