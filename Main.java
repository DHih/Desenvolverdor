import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a, b, c, MaiorAB;

	Scanner sc = new Scanner(System.in);
	        a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
//obs: função do  Math.abs() e transforma negativo em positivo.
			
	MaiorAB = (a + b + Math.abs(a - b)) / 2;
		//MaiorAB = (7+14)+ Math.abs(7-14))/2;
		//MaiorAB = (21+7)/2;
				//MaiorAB = 14
		
		MaiorAB = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;
		//MaiorAB = (14+106+Math.abs(14-106))/2
		//MaiorAB = (120+92)/2
		//MaiorAB = 106

		System.out.println(MaiorAB + " eh o maior");

sc.close();
		}
	
}

	
	
	
