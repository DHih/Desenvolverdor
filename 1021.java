import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);
		double entrada;
		int valor,resultado;
		double a,b,c,d,e,f;
		entrada = sc.nextDouble();
		a = 100;
		valor =  (int) entrada / (int)a;
		System.out.printf("%d%n",valor);
		resultado = (int)entrada % (int)a;
		System.out.printf("%d%n",resultado);
		
		b = 50;
		valor = (int) resultado / (int) b;
		System.out.printf("%d%n",valor);
		resultado = (int) resultado % (int) b;
		System.out.printf("%d%n",resultado);
	
		c = 20;
		valor = (int) resultado / (int) c;
		System.out.printf("%d%n",valor);
		resultado = (int) resultado % (int) c;
		
		d = 10;
		valor = (int) resultado / (int) d;
		System.out.printf("%d%n",valor);
		resultado = (int) resultado % (int) d;
		System.out.printf("%d%n",resultado);
		
		e = 5;
		valor = (int) resultado / (int) e;
		System.out.printf("%d%n",valor);
		resultado = (int) resultado % (int) e;
		System.out.printf("%d%n",resultado);
		
		f = 2;
		valor = (int) resultado / (int) f;
		System.out.printf("%d%n",valor);
		resultado = (int) resultado % (int) f;
		System.out.printf("%d%n",resultado);
		
		System.out.println("MOEDA:");
		
		
		sc.close();
	}

}
