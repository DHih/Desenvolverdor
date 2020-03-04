  
import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);//coloca em cima do scanner para pode troca a virgula pelo ponto.
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double percentual;
		if (salario <= 400.0) {
			percentual = 15.0;
		}
		else if (salario <= 800.0) {
			percentual = 12.0;
		}
		else if (salario <= 1200.0) {
			percentual = 10.0;
		}
		else if (salario <= 2000.0) {
			percentual = 7.0;
		}
		else {
			percentual = 4.0;
		}
		
		double reajuste = salario * percentual / 100.0;//formula para calcular porcentagem
		double novoSalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);
		
		sc.close();
	}
}
