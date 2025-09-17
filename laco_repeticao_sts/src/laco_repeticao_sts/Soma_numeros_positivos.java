package laco_repeticao_sts;

import java.util.Scanner;

public class Soma_numeros_positivos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int number;
		int soma_number = 0;
		
		do {
			System.out.println("Digite um numero: ");
			number = leia.nextInt();
			if(number > 0) {
				soma_number += number;
			}
		} while (number != 0);
		
		System.out.println("A soma dos numeros dos numeros positivos é: " + soma_number);
		
		leia.close();

	}

}
