import java.io.File;
import java.io.IOException;



public class Consumidor {
	public static void main (String []args){
		
		String caminho=("arquivo.txt");
		Manipulador arq=new Manipulador();
		File arquivo = new File("arquivo.txt");
		int x=1;
		
		while(x==1){
			
		if(arquivo.exists()){
		try {
			arq.leitor(caminho);
			 
			arquivo.delete();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
		}
	}
}
