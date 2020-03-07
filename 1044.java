import java.util.Scanner;
public class Main {
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
//	duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
//	tendo uma duração mínima de 1 hora e máxima de 24 horas.
	
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
