package numeros;

import java.util.Scanner;

public class VerificarNumero {

	public static void main(String[] args) {
		int num1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero no intervalo de 0 a 100");
		num1 = teclado.nextInt();
		
		if(num1 >= 0 && num1 <= 100) {
			System.out.println("N�mero v�lido");
		}else {
			System.out.println("N�mero inv�lido");
		}
		
		teclado.close();
	}

}
