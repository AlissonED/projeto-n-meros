package numeros;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinha��o {

	public static void main(String[] args) {
		String res, resf = "a", resd;
		int res1=1000;
		
		Scanner teclado = new Scanner(System.in);	
		
		while (!resf.contentEquals("n�o")){
		Random aleatorio = new Random();
		
		int numg = aleatorio.nextInt(100);
		
		
		System.out.println("\t\tBem-vindo ao jogo da advinha��o !!!");
		System.out.println("\nSelecione a dificuldade do jogo : \nTecle 1 para dificuldade F�cil \nTecle 2 para dificuldade m�dia \nTecle 3 para dificuldade d�ficil \nTecle 4 para dificuldade impossivel");
		resd = teclado.next();
		
		if(resd.contentEquals("1")) {
			
			System.out.println("N�mero gerado: XX");
			
			System.out.println("Digite um palpite do n�mero (Entre 0 e 99)");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			
			while (res1!=numg) {
				
			if(res1 < numg) {
				System.out.println("\nO n�mero � maior que o palpite \nTente outro n�mero");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			}
			if(res1 > numg) {
				System.out.println("\nO n�mero � menor que o palpite \nTente outro n�mero");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
				
				}
			
			}
			
			
			System.out.println("Parab�ns voc� acertou !!!");
			
			System.out.println("\nQuer jogar novamente? [sim] [n�o]");
			resf=teclado.next();
			
		}
		
		
		if(resd.contentEquals("2")) {
		
		
		System.out.println("N�mero gerado: XX");
		
		System.out.println("Digite um palpite do n�mero (Entre 0 e 99) ,Voc� tem 5 tentativas");
		res = teclado.next();
		res1 = Integer.parseInt(res); 		
		for (int x = 0; x  < 5; x ++) {
		if (res1!=numg) {
			
		if(res1 < numg) {
			System.out.println("\nO n�mero � maior que o palpite \nTente outro n�mero");
			res = teclado.next(); 
			res1 = Integer.parseInt(res);
		}
		if(res1 > numg) {
			System.out.println("\nO n�mero � menor que o palpite \nTente outro n�mero");
			res = teclado.next(); 
			res1 = Integer.parseInt(res);
			}
		}
		if(res1==numg) {
		System.out.println("Parab�ns voc� acertou !!!");
		System.out.println("\nQuer jogar novamente? [sim] [n�o]");
		resf=teclado.next();
		break;
		}
		}
		
		if (res1!=numg) {
		System.out.println("Suas tentativas acabaram ;(");
		System.out.println("\nQuer jogar novamente? [sim] [n�o]");
		resf=teclado.next();
		}
		}
	
		
		
		if(resd.contentEquals("3")) {
			
			
			System.out.println("N�mero gerado: XX");
			
			System.out.println("Digite um palpite do n�mero (Entre 0 e 99) ,Voc� tem 3 tentativas");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			for (int x = 0; x  < 2; x ++) {
			if (res1!=numg) {
				
			if(res1 < numg) {
				System.out.println("\nO n�mero � maior que o palpite \nTente outro n�mero");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			}
			if(res1 > numg) {
				System.out.println("\nO n�mero � menor que o palpite \nTente outro n�mero");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
				}
			}
			if(res1==numg) {
				System.out.println("Parab�ns voc� acertou !!!");
			System.out.println("\nQuer jogar novamente? [sim] [n�o]");
			resf=teclado.next();
			break;
			}
			}
			
			if (res1!=numg) {
			System.out.println("Suas tentativas acabaram ;(");
			System.out.println("\nQuer jogar novamente? [sim] [n�o]");
			resf=teclado.next();
			}
		}
		
		
		
		if(resd.contentEquals("4")) {
			
System.out.println("N�mero gerado: XX");
			
			System.out.println("Digite um palpite do n�mero (Entre 0 e 99) ,Voc� tem 10 tentativas \nMas nenhuma dica, boa sorte");
			res = teclado.next();
			res1 = Integer.parseInt(res); 		
			for (int x = 0; x  < 10; x ++) {
			if (res1!=numg) {
				
			
				System.out.println("\nErrou, tente novamente");
				res = teclado.next(); 
				res1 = Integer.parseInt(res);
			
			if(res1==numg) {
				System.out.println("Parab�ns voc� acertou !!!");
			System.out.println("\nQuer jogar novamente? [sim] [n�o]");
			resf=teclado.next();
			break;
			}
			}
			}
			if (res1!=numg) {
			System.out.println("Suas tentativas acabaram ;(");
			System.out.println("\nQuer jogar novamente? [sim] [n�o]");
			resf=teclado.next();
			}
		
		}
		


		

		}
	teclado.close();
	}
}

	




