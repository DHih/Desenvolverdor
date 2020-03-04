import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
double salario = sc.nextDouble();
double reajuste;
if(salario < 400.00 || salario == 400.00) {
	reajuste = salario + (15.0 / 100.0 * salario);
	System.out.printf("salario %.2f%n",reajuste);
	System.out.println("reajuste ganho 60.00");
	System.out.println("Em percentual: 15%");
	
}else if(salario < 400.01 || salario == 800.00) {
	reajuste = salario + (10.0 / 100.0 * salario);
	System.out.printf("salario %.2f%n",reajuste);
	System.out.println("reajuste ganho 80.00");
	System.out.println("Em percentual: 10%");

}else if(salario < 800.01 || salario == 1200.00) {
	reajuste = salario + (7.0 / 100.0 * salario);
	System.out.printf("salario %.2f%n",reajuste);
	System.out.println("reajuste ganho 140.00");
	System.out.println("Em percentual: 7%");

}else {
	System.out.println("Em percentual: 4%");
}
sc.close();
	}

}
