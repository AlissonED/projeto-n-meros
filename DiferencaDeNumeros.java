package numeros;

import java.util.Scanner;

public class DiferencaDeNumeros {

	public static void main(String[] args) {
		int num1, num2, dif;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros:");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if(num1>num2) {
		dif = num1 - num2;
		System.out.println("a diferen�a entre o maior e o menor n�mero � de "+dif);
			}
		if(num1<num2) {
			dif = num2 - num1;
			System.out.println("a diferen�a entre o maior e o menor n�mero � de "+dif);
			}
		teclado.close();
	}

}
