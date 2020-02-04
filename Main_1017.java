import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    double hora;
		double velocidade;
		double kilometro = 12;
		
		hora = sc.nextDouble();
		velocidade = sc.nextDouble();
		
		double litros = hora*velocidade/kilometro;
		
		System.out.printf("%.3f%n",litros);
		
	sc.close();
	}

}
