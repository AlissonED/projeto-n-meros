package numeros;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação {

	public static void main(String[] args) {
		String res, resf = "a", resd;
		int res1=1000;
		
		Scanner teclado = new Scanner(System.in);	
		
		while (!resf.contentEquals("não")){
		Random aleatorio = new Random();
		
		int numg = aleatorio.nextInt(100);
		
		
		System.out.println("\t\tBem-vindo ao jogo da advinhação !!!");
		System.out.println("\nSelecione a dificuldade do jogo : \nTecle 1 para dificuldade Fácil \nTecle 2 para dificuldade média \nTecle 3 para dificuldade díficil \nTecle 4 para dificuldade impossivel");
		resd = teclado.next();
		
		if(resd.contentEquals("1")) {
			
			System.out.println("Número gerado: XX");
			
			System.out.println("Digite um palpite do número (Entre 0 e 99)");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			
			while (res1!=numg) {
				
			if(res1 < numg) {
				System.out.println("\nO número é maior que o palpite \nTente outro número");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			}
			if(res1 > numg) {
				System.out.println("\nO número é menor que o palpite \nTente outro número");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
				
				}
			
			}
			
			
			System.out.println("Parabéns você acertou !!!");
			
			System.out.println("\nQuer jogar novamente? [sim] [não]");
			resf=teclado.next();
			
		}
		
		
		if(resd.contentEquals("2")) {
		
		
		System.out.println("Número gerado: XX");
		
		System.out.println("Digite um palpite do número (Entre 0 e 99) ,Você tem 5 tentativas");
		res = teclado.next();
		res1 = Integer.parseInt(res); 		
		for (int x = 0; x  < 5; x ++) {
		if (res1!=numg) {
			
		if(res1 < numg) {
			System.out.println("\nO número é maior que o palpite \nTente outro número");
			res = teclado.next(); 
			res1 = Integer.parseInt(res);
		}
		if(res1 > numg) {
			System.out.println("\nO número é menor que o palpite \nTente outro número");
			res = teclado.next(); 
			res1 = Integer.parseInt(res);
			}
		}
		if(res1==numg) {
		System.out.println("Parabéns você acertou !!!");
		System.out.println("\nQuer jogar novamente? [sim] [não]");
		resf=teclado.next();
		break;
		}
		}
		
		if (res1!=numg) {
		System.out.println("Suas tentativas acabaram ;(");
		System.out.println("\nQuer jogar novamente? [sim] [não]");
		resf=teclado.next();
		}
		}
	
		
		
		if(resd.contentEquals("3")) {
			
			
			System.out.println("Número gerado: XX");
			
			System.out.println("Digite um palpite do número (Entre 0 e 99) ,Você tem 3 tentativas");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			for (int x = 0; x  < 2; x ++) {
			if (res1!=numg) {
				
			if(res1 < numg) {
				System.out.println("\nO número é maior que o palpite \nTente outro número");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			}
			if(res1 > numg) {
				System.out.println("\nO número é menor que o palpite \nTente outro número");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
				}
			}
			if(res1==numg) {
				System.out.println("Parabéns você acertou !!!");
			System.out.println("\nQuer jogar novamente? [sim] [não]");
			resf=teclado.next();
			break;
			}
			}
			
			if (res1!=numg) {
			System.out.println("Suas tentativas acabaram ;(");
			System.out.println("\nQuer jogar novamente? [sim] [não]");
			resf=teclado.next();
			}
		}
		
		
		
		if(resd.contentEquals("4")) {
			
System.out.println("Número gerado: XX");
			
			System.out.println("Digite um palpite do número (Entre 0 e 99) ,Você tem 10 tentativas \nMas nenhuma dica, boa sorte");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			for (int x = 0; x  < 10; x ++) {
			if (res1!=numg) {
				
			
				System.out.println("\nErrou, tente novamente");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			
			if(res1==numg) {
				System.out.println("Parabéns você acertou !!!");
			System.out.println("\nQuer jogar novamente? [sim] [não]");
			resf=teclado.next();
			break;
			}
			}
			}
			if (res1!=numg) {
			System.out.println("Suas tentativas acabaram ;(");
			System.out.println("\nQuer jogar novamente? [sim] [não]");
			resf=teclado.next();
			}
		
		}
		


		

		}
	teclado.close();
	}
}

	




