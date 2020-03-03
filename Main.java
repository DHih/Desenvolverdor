import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
if(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0){
	System.out.printf("Valores aceitos");
}
else {
	System.out.printf("Valores nao aceitos");
}


	sc.close();
	}

}
