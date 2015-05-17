import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) throws IOException {
		String path = "d:\\arquivo.txt";
		Scanner in = new Scanner(System.in);
		int op;

		do {
			System.out.println("Deseja repetir? 1-Sim/2-Não");
			op = in.nextInt();
			Manipulador.escritor(path);
			Manipulador.leitor(path);
		} while (op != 2);
	}
}
