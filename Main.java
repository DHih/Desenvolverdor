import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// faça um programa para ler um numero indeterminado de dados, contendo cada um, a idade de um individuo.
		//O ultimo dado que não entrara nos calculos, contem um valor de idade negativa. calcular e imprimir a idade 
		//media deste grupo de individuos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem 
		//" impossivel calcular"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int quantidade = 0;//ira conta quantas idade ira o programa ler antes de chega no numero negativo
		double media = 0;
		while (idade > 0) {//enquanto essa função acontecer ele ira executa as funções abaixo
			quantidade += idade;// ele ira fazer a soma de todas as idade digitada.
			media += 1; // ele ira conta a quantidade de idade foi digitado  
			idade = sc.nextInt();
		}
		if (media > 0) {//se eu tiver digitado pelo menos 1 idade valida ele ira fazer essa função
			media = (double)quantidade / media;//pega a quantidade total de idade digitada e dividir pelas quantidades de idade digitada
			System.out.printf("%.2f%n", media);
		} else {//se eu digitar um valor negativo ele mostra a mensagem abaixo.
			System.out.println("impossivel calcular");

		}

		sc.close();
	}

}
