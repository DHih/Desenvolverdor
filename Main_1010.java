import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		double c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble(); 
		
		
		int d;
	    int e;
	    double f;
		
		d = sc.nextInt();
		e = sc.nextInt();
		f = (double) sc.nextDouble();
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",(e*f)+(b*c));
		
		
		
		
		
		
		sc.close();
				

	}

}
