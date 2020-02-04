import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);

int carro1;
int kilometro = 2;
carro1 = sc.nextInt();

int distancia = carro1*kilometro;

System.out.printf("%d minutos%n",distancia);


sc.close();

	}

}
