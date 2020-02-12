import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int notas,resto;
		int a,b,c,d,e,f,g;
		int valor;
		
		valor = sc.nextInt();
		a =100;
		 notas = valor / a;
			System.out.println(notas+ " nota(s) de R$ " +a+",00");

	resto = valor % a;
	
	b = 50;
	notas = resto / b;
	System.out.println(notas+ " nota(s) de R$ " +b+",00");
	resto = resto % b;
	
	c =20;
	notas = resto / c;
	System.out.println(notas+ " nota(s) de R$ " +c+",00");
	resto = resto % c;
	
	d =10;
	notas = resto / d;
	System.out.println(notas+ " nota(s) de R$ " +d+",00");
	resto = resto % d;
	e = 5;
	notas = resto / e;
	System.out.println(notas+ " nota(s) de R$ " +e+",00");
	resto = resto % e;
	f =2;
	notas = resto / f;
	System.out.println(notas+ " nota(s) de R$ " +f+",00");
	resto = resto % f;
	g =1;
	notas = resto / g;
	System.out.println(notas+ " nota(s) de R$ " +g+",00");
	
	
	
	sc.close();
	}

}
