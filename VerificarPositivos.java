package numeros;

import java.util.Scanner;

public class VerificarPositivos {
	public static void main(String[] args) {
		int num1;
		String resp="a";
		Scanner teclado = new Scanner(System.in);
		
		while(!resp.contentEquals("sim")) {
		System.out.println("Insira um número positivo ou negativo");
		num1 = teclado.nextInt();
		
		if(num1 >= 0) {
			System.out.println("Número positivo");
		}else {
			System.out.println("Número negativo");
		}
			
		System.out.println("Encerrar programa?");
		resp = teclado.next();
		}
		
		teclado.close();
		
	
	}
	
	
	
}
