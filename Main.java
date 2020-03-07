import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int resultado;
	if(a < b ) {
		 resultado = b - a;
	System.out.println("O JOGO DUROU " +resultado+ " HORA(S)");
			
	}
	else {
		resultado = 24 - a + b;
		System.out.println("O JOGO DUROU " +resultado+ " HORA(S)");
	}
	sc.close();
	}

}
