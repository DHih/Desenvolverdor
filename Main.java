import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	String nome = sc.next();
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	
	double c = a+b*nome;
		
		
		sc.close;
	}

}
