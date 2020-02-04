import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
//x1=1.0 y1=7.0 x2=5.0 y2=9.0
double x1,x2,y1,y2,valor,valor2,resultado;

x1 = sc.nextDouble();
y1 = sc.nextDouble();
x2 = sc.nextDouble();
y2 = sc.nextDouble();

valor =(x2-x1);
//(5.0-1.0) = 4.0
valor2 = (y2-y1);
//(9.0-7.0) = 2.0
resultado = Math.pow(valor,2.0)+Math.pow(valor2,2.0);
//resultado = (4.0*4.0)+Math.pow(2.0*2.0)
//16+4 =20
resultado = Math.sqrt(resultado);
//resultado = raiz quadrada de 20
System.out.printf("%.4f%n",resultado);
//4.4721
sc.close();
	}

}