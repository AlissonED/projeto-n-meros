package numeros;

import java.util.Scanner;

public class ComparacaoNumeros {

	public static void main(String[] args) {
		int num1, num2, num3;
		String resp = "a";
		Scanner teclado = new Scanner(System.in);
		
		
		while(!resp.contentEquals("Não")||!resp.contentEquals("N")||!resp.contentEquals("nao")) {
		System.out.println("Digite três números :");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
			System.out.println("O maior número foi "+ num1+", o segundo menor foi "+num2+", e o menor foi "+num3);
			}else {
				System.out.println("O maior número foi "+ num1+", o segundo menor foi "+num3+", e o menor foi "+num2);
			}
			}
		if(num3>num1&&num3>num2) {
			if(num2>num1) {
				System.out.println("O maior número foi "+ num3+", o segundo menor foi "+num2+", e o menor foi "+num1);
				}else {
					System.out.println("O maior número foi "+ num3+", o segundo menor foi "+num1+", e o menor foi "+num2);
				}
		}
			
		if(num1<num2&&num2>num3) {
			if(num1>num3) {
				System.out.println("O maior número foi "+ num2+", o segundo menor foi "+num1+", e o menor foi "+num3);
				}else {
					System.out.println("O maior número foi "+ num2+", o segundo menor foi "+num3+", e o menor foi "+num1);
				}
		}
		if(num1==num2 && num2>num3) {
			System.out.println("Os dois primeiros números são iguais com valor "+num1+" e "+num3+" é o menor número");
		}
		if(num1==num2 && num2<num3) {
			System.out.println("Os dois primeiros números são iguais com valor "+num1+" e "+num3+" é o maior número");
		}
		if(num1==num3 && num2>num3) {
			System.out.println("O primeiro e o último número são iguais com valor "+num1+" e "+num2+" é o maior número");
		}
		if(num1==num3 && num2<num3) {
			System.out.println("O primeiro e o último número são iguais com valor "+num1+" e "+num2+" é o menor número");
		}
		if(num2==num3 && num2<num1) {
			System.out.println("O segundo e o último número são iguais com valor "+num2+" e "+num1+" é o maior número");
		}
		if(num2==num3 && num2>num1) {
			System.out.println("O segundo e o último número são iguais com valor "+num2+" e "+num1+" é o menor número");
		}
		if(num2==num3 && num2==num1) {
			System.out.println("Todos os números são iguais com valor "+num2);
		}
		System.out.println("Quer recomeçar? [Sim] [Não]");
		resp = teclado.next();
		}
		
		
		
		teclado.close();
	}

}
