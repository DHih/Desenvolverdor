import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara.
//Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�,
//caso haja uma divis�o por 0 ou raiz de numero negativo.

double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double raiz = b * b - 4 * a * c;
//nesse caso se "A" for igual a "0" ou se a raiz for numero negativo ira mostra essa frase ou seja.
//se o calculo final for FALSO ele ira mostra essa frase.
if(a == 0 || raiz < 0 ){
  System.out.println ("impossivel calcular");
}//
else {
	double r1 = (- b + Math.sqrt(raiz))/(2*a);
	double r2 = (- b - Math.sqrt(raiz))/(2*a);
	 System.out.printf("R1 = %.5f%n",r1);
     System.out.printf("R2 = %.5f%n",r2);
}
     sc.close();
	
	}
}
