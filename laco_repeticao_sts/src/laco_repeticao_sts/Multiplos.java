package laco_repeticao_sts;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro numero do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o ultimo numero do intervalo: ");
		numero2 = leia.nextInt();
		
		if(numero1 >= numero2) {
			System.out.println("O intervalo é invalido: ");
			 leia.close();
		}
		
		System.out.printf("No intervalo entre %d e %d:", numero1, numero2);
		System.out.println(                                              );
		System.out.println(                                              );
		
		for(int i = numero1; i < numero2; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d é multiplo de 3 e 5\n ", i);
				}
			
				
		}
		
		leia.close();			
	}

}
