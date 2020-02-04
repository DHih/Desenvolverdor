import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
	int distancia;
    double combustivel;

	distancia = sc.nextInt();
combustivel = sc.nextDouble();

	double pecorrido = distancia/combustivel;
//obs: a quebra de linha vai depois do km/l devido a isso o %n está 
//separado do %.3f

	System.out.printf("%.3f km/l%n",pecorrido);

		sc.close();

	}

}

