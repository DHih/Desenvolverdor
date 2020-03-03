import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	int pedido = sc.nextInt();
	int quantidade = sc.nextInt();
	double resultado;
	double a = 4.0;
	double b = 4.5;
	double c = 5.0;
	double d = 2.0;
	double e = 1.5;
	
	if(pedido == 1) {
		resultado = a * quantidade;
		System.out.printf("Total: R$ %.2f%n",resultado);
		
	}else if (pedido == 2) {
		resultado = b * quantidade;
		System.out.printf("Total: R$ %.2f%n",resultado);
		
	}else if (pedido == 3) {
		resultado = c * quantidade;
		System.out.printf("Total: R$ %.2f%n",resultado);
		
	}else if (pedido == 4) {
		resultado = d * quantidade;
		System.out.printf("Total: R$ %.2f%n",resultado);
	
	}else{
		resultado = e * quantidade;
		System.out.printf("Total: R$ %.2f%n",resultado);
	
	
	}
	sc.close();
	}

}
