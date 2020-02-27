import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);
	double nota1 = sc.nextDouble();
	double nota2 = sc.nextDouble();
	double resultado = nota1 + nota2;
	//função de if simples na qual está calculando a nota dos 2 bimestre do aluno.
	System.out.printf("NOTA FINAL = %.1f%n",resultado);
	if(resultado < 60.0){
       System.out.println("REPROVADO");	
	}
	
	sc.close();
	}

}
