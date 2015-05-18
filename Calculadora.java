import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Calculadora  {

	int x, y, result=0;
	String operador;

	public int calculando(int x, String operador, int y) {

		this.x = x;
		this.operador = operador;
		this.y = y;
		
		if (operador.equals("+")){
			result = x + y;
		}else
			if (operador.equals("-")){
				result = x - y;
			}else
				if (operador.equals("*")){
					result = x * y;
				}else
					if (operador.equals("/")){
						result = x / y;
					}
		
		try {
			
			PrintWriter pw = new PrintWriter(new FileWriter("Pw.txt",true), true);
			SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			pw.println(data.format(new Date()));
			pw.println("Primeiro operando: "+x+"");
			pw.println("Operador: "+operador+"");
			pw.println("Segundo operando: "+y+"");
			pw.close();
			
		} catch (IOException erro) {
			
			erro.printStackTrace();
			
		}
		
		return result;
	}
}
