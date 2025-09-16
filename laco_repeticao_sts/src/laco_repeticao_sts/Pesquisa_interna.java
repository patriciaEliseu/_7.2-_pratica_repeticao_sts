package laco_repeticao_sts;

import java.util.Scanner;
public class Pesquisa_interna {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, genero, dev;
		int mulherFront = 0, homemMob40Maior = 0, nBinaFull30Menor =0, totalDev = 0, somaIdade = 0;
		int back =0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Digite sua idade :");
			idade = leia.nextInt();

			System.out.println("===============================================");
			System.out.println("=================Pesquisa======================");
 		    System.out.println("============Identidade de Genero===============");
			System.out.println("              1 - Muler Cis                    ");
			System.out.println("              2 - Homem Cis                    ");
			System.out.println("              3 - Não Binário                  ");
			System.out.println("              4 - Mulher Trans                 ");
			System.out.println("              5 - Homem Trans                  ");
			System.out.println("              6 - Outros                       ");
			System.out.println("===============================================");
			System.out.println("Digite o codigo do seu Gênero:                 ");
			genero = leia.nextInt();
			System.out.println("===============================================");
			System.out.println("=================Pesquisa======================");
			System.out.println("=============Pessoa Desenvolvedora=============");
			System.out.println("              1 - Backend                      ");
			System.out.println("              2 - Frontend                     ");
			System.out.println("              3 - Mobile                       ");
			System.out.println("              4 - FullStack                    ");
			System.out.println("===============================================");
			System.out.println("Digite o código de Desenvolvedora:             ");
			dev = leia.nextInt();

			totalDev ++;
			somaIdade += idade;
			
			if(dev == 1) {
				back ++;
			}else if(dev == 2 && (genero == 1 || genero == 4)) {
				mulherFront ++;
			}else if((idade > 40 && dev == 3) && (genero == 2 || genero == 5 )) {
				homemMob40Maior ++;
			}else if((dev == 4 && idade < 30) && genero == 3) {
				nBinaFull30Menor ++;
			}
			
			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		
		System.out.println("\n=======RESULTADOS========");
		System.out.println("O numero de pessoas desenvolvedoras Backend: " + back);
		System.out.println("O numero de mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFront);
		System.out.println("O numero de homens Cis e Trans de desenvolvedores Mobile maiores de 40 anos: " + homemMob40Maior);
		System.out.println("O numero Não Binarios desenvolvedores FullStack menores de 30 anos: " + nBinaFull30Menor);
		System.out.println("O numero total de pessoas que responderam à pesquisa: " + totalDev);
		
		
		if (totalDev > 0) {
			double mediaIdade = (double) somaIdade / totalDev;
            System.out.printf("Média de idade: %.2f\n", mediaIdade);
        } 

        leia.close();
		
		
	}

}
