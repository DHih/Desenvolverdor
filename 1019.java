import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);

 int entrada;
 int resultado,valor,valor2,valor3;
 int horas,minutos,segundos;
 
 entrada = sc.nextInt();
 
 horas = 3600;
 valor = entrada/horas;
 resultado = entrada%horas;
 
 minutos = 60;
 valor2 = resultado/minutos;
 resultado = resultado % minutos;

 segundos = 60;
 valor3 = resultado / segundos;
 resultado = resultado % segundos;
 System.out.println(+valor+":"+valor2+":"+resultado);

	
	
	sc.close();
	}

}
