package numeros;

import java.util.Scanner;

public class ComparacaoNumeros {

	public static void main(String[] args) {
		int num1, num2, num3;
		String resp = "a";
		Scanner teclado = new Scanner(System.in);
		
		
		while(!resp.contentEquals("N�o")||!resp.contentEquals("N")||!resp.contentEquals("nao")) {
		System.out.println("Digite tr�s n�meros :");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
			System.out.println("O maior n�mero foi "+ num1+", o segundo menor foi "+num2+", e o menor foi "+num3);
			}else {
				System.out.println("O maior n�mero foi "+ num1+", o segundo menor foi "+num3+", e o menor foi "+num2);
			}
			}
		if(num3>num1&&num3>num2) {
			if(num2>num1) {
				System.out.println("O maior n�mero foi "+ num3+", o segundo menor foi "+num2+", e o menor foi "+num1);
				}else {
					System.out.println("O maior n�mero foi "+ num3+", o segundo menor foi "+num1+", e o menor foi "+num2);
				}
		}
			
		if(num1<num2&&num2>num3) {
			if(num1>num3) {
				System.out.println("O maior n�mero foi "+ num2+", o segundo menor foi "+num1+", e o menor foi "+num3);
				}else {
					System.out.println("O maior n�mero foi "+ num2+", o segundo menor foi "+num3+", e o menor foi "+num1);
				}
		}
		if(num1==num2 && num2>num3) {
			System.out.println("Os dois primeiros n�meros s�o iguais com valor "+num1+" e "+num3+" � o menor n�mero");
		}
		if(num1==num2 && num2<num3) {
			System.out.println("Os dois primeiros n�meros s�o iguais com valor "+num1+" e "+num3+" � o maior n�mero");
		}
		if(num1==num3 && num2>num3) {
			System.out.println("O primeiro e o �ltimo n�mero s�o iguais com valor "+num1+" e "+num2+" � o maior n�mero");
		}
		if(num1==num3 && num2<num3) {
			System.out.println("O primeiro e o �ltimo n�mero s�o iguais com valor "+num1+" e "+num2+" � o menor n�mero");
		}
		if(num2==num3 && num2<num1) {
			System.out.println("O segundo e o �ltimo n�mero s�o iguais com valor "+num2+" e "+num1+" � o maior n�mero");
		}
		if(num2==num3 && num2>num1) {
			System.out.println("O segundo e o �ltimo n�mero s�o iguais com valor "+num2+" e "+num1+" � o menor n�mero");
		}
		if(num2==num3 && num2==num1) {
			System.out.println("Todos os n�meros s�o iguais com valor "+num2);
		}
		System.out.println("Quer recome�ar? [Sim] [N�o]");
		resp = teclado.next();
		}
		
		
		
		teclado.close();
	}

}
