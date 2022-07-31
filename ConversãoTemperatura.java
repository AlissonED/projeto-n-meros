package numeros;

import java.util.Scanner;

public class ConversãoTemperatura {

	public static void main(String[] args) {
		double f;
		int c, k;
		String[] graus;
		String grau;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a temperatura com seu símbolo :");
		grau = teclado.next();
		graus = grau.split("°");
		graus = grau.split("º");
		int temp = Integer.parseInt(graus[0]);
		
		if (graus[1].contentEquals("c")||graus[1].contentEquals("C")||graus[1].contentEquals("Celsius")) {
			f = (9 * temp + 160) / 5;
			k = temp + 273;
			System.out.println("Essa temperatura em graus Fahrenheit corresponde a : "+ f +" Graus");
			System.out.println("Essa temperatura em graus Kelvin corresponde a : "+ k +" Graus");
		
		}
		if (graus[1].contentEquals("f")||graus[1].contentEquals("F")||graus[1].contentEquals("Fahrenheit")) {
			c=(5*(temp-32))/9;
			k = c + 273;
			System.out.println("Essa temperatura em graus Celsius corresponde a : "+ c +" Graus");
			System.out.println("Essa temperatura em graus Kelvin corresponde a : "+ k +" Graus");
		
		}
		if (graus[1].contentEquals("K")||graus[1].contentEquals("k")||graus[1].contentEquals("Kelvin")) {
			c = temp - 273;
			f = (temp-273)* 1.8+ 32;
			System.out.println("Essa temperatura em graus Celsius corresponde a : "+ c +" Graus");
			System.out.println("Essa temperatura em graus Fahrenheit corresponde a : "+ f +" Graus");
		}
		
		
		
		teclado.close();
	}
	
}
