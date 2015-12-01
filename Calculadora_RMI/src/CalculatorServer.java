import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			MyllenaCalculator c = new CalculatorImpl();
			Naming.rebind("MyllenaCalculator", c);
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculatorServer();
	}
}