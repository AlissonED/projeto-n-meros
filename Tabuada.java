package numeros;

import java.util.Scanner;

public class Tabuada {

	
	public static void main(String[] args) {
		int num1, num2;
		int resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um número para que seja exibida a tabuada dele");
		num1 = teclado.nextInt();
		
		System.out.println("Você quer a tabuada desse número até vezes quanto?");
		num2 = teclado.nextInt();
		
		for(int x = 1;x <= num2; x ++) {
			resultado = num1 * x;
			System.out.print(num1+" x "+x+" = "+resultado+"           ");
		}
		
		teclado.close();
	}

}
