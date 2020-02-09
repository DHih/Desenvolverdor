import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int notas,notas2,notas3,notas4,notas5,notas6,notas7;
		int resto,resto2,resto3,resto4,resto5,resto6,resto7;
		int valor;
		
		valor = sc.nextInt();
		int a =100;
		 notas = valor / a;
	resto = valor % a;
	
	int b =50;
	notas2 = resto / b;
	resto2 = resto % b;
	
	int c =20;
	notas3 = resto2 / c;
	resto3 = resto2 % c;
	
	int d =10;
	notas4 = resto3 / d;
	resto4 = resto3 % d;
	int e = 5;
	notas5 = resto4 / e;
	resto5 = resto4 % e;
	int f =2;
	notas6 = resto5 / f;
	resto6 = resto5 % f;
	int g =1;
	notas7 = resto6 / g;
	resto7 = resto5 % g;
	
	
	System.out.printf("%d nota (s) de R$ %d,00%n",notas,a);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas2,b);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas3,c);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas4,d);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas5,e);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas6,f);
	System.out.printf("%d nota (s) de R$ %d,00%n",notas7,g);

	
	
	sc.close();
	}

}
