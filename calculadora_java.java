package teste2;

import java.util.Scanner;

public class calculadora_java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		int a, b;
		System.out.println("digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtra��o = subtra��o(a,b);
		int multiplica��o = multiplica��o(a,b);
		double divis�o = divis�o(a,b);
		
		System.out.println("soma" + soma);
		System.out.println("subtra��o" + subtra��o);
		System.out.println("divis�o" + divis�o);
		System.out.println("multiplic�o" + multiplica��o);
	}
   public static int soma(int a, int  b) {
	   return a + b;
   }
   public static int subtra��o(int a, int  b) {
	   return a - b;
   }
   public static double divis�o(double a, double  b) {
	   return a / b;
   }
   public static int multiplica��o(int a, int  b) {
	   return a * b;
   }
}
