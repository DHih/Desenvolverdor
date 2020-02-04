import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);

		Scanner sc= new Scanner (System.in);
		
		int a= 4;
		double b= 3.0;
		double c= 3.14159;
		int x = sc.nextInt();
		int y = 3;
		double d =Math.pow(x,y);
		
		System.out.printf("VOLUME = %.3f%n",(a/b)*(c)*(d));
		
		sc.close();
		
		
	}

}
