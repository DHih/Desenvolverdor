import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);

Scanner sc = new Scanner (System.in);

double a;
double b;
double c;
double triangulo;
double circulo;
double trapezio;
double quadrado;
double retangulo;

triangulo = a*c/2.0;
 circulo = 3.14159*c*c;
 trapezio = (a+b) / 2.0*c;
 quadrado = b*b;
 retangulo = a*b;

a= sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();

sc.close();
		
	}

}
