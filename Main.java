import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);

 int idade;
 int ano,mes,dia;
 int valor,resultado;
 idade = sc.nextInt();
 
 
 ano = 365;
 valor =  idade / ano;
 System.out.println(valor+" ano(s)");
 resultado = idade % ano;
 
 mes = 30;
 valor = resultado / mes;
 System.out.println(valor+" mes(es)");
 resultado = resultado % mes;

 dia = 1;
 valor = resultado / dia;
 resultado = resultado % dia;
 System.out.println(valor+" dia(s)");

	
	
	sc.close();
	}

}