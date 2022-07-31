package numeros;

import java.util.Scanner;

public class DiferencaDeNumeros {

	public static void main(String[] args) {
		int num1, num2, dif;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if(num1>num2) {
		dif = num1 - num2;
		System.out.println("a diferença entre o maior e o menor número é de "+dif);
			}
		if(num1<num2) {
			dif = num2 - num1;
			System.out.println("a diferença entre o maior e o menor número é de "+dif);
			}
		teclado.close();
	}

}
