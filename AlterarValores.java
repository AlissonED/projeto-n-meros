package numeros;

import java.util.Scanner;

public class AlterarValores {

	public static void main(String[] args) {
		int A, B, C;
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Insira dois valores :");
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		C = B;
		B = A;
		A = C;
		
		System.out.println("valor A : "+ A +" Valor B : " + B);
		
		teclado.close();
	
	
	
	
	}

}
