package aulaTres;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Oque voce acha?");
		String frase = s.nextLine();
		
		System.out.println("Insira um número inteiro");
		double numUm = s.nextDouble();
		
		System.out.println("insira outro numero inteiro");
		double numDois = s.nextDouble();
		
		System.out.println("insira outro numero inteiro");
		double numTres = s.nextDouble();
		
		System.out.println("A soma de " + numUm + " mais " + numDois + " mais " + numTres + " é: " + (numUm + numDois + numTres));
		System.out.println("A divisão de " + numUm + " , " + numDois + " e " + numTres + " é: " + (numUm / numDois / numTres));
		System.out.println("A subtração de " + numUm + " menos " + numDois + " menos " + numTres + " é: " + (numUm - numDois - numTres));
		System.out.println("A multiplicação de " + numUm + " , " + numDois + " , " + numTres + " é: " + (numUm * numDois * numTres));
		System.out.println("Oque voce achou foi: " + frase);
		
// nextInt - números inteiros
//nextDouble - números quebrados
//netxtLine - String5
		
	}

}
