/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Utilizando seus conhecimentos de programação em estruturas de decisão e laços de repetição,
elabore as soluções para os itens abaixo. Podem ser feitos todos em um único arquivo ou um
arquivo para cada item, a escolha é livre.*/
import java.util.Scanner;
public class Lista6Exercicios41A60{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o numero inteiro (entre 41 e 60, inclusos) do exercicio que voce gostaria de ver: ");
		int exercicio = ler.nextInt();
		int numeroInteiro = 0, fatorial = 1, quantidadeDigitada = 0, quantidadeImpressos = 0, numeroAnterior = 1, numeroRetrasado = 0, auxiliar = 0;
		/*int[] numerosPrimos = mew int ;*/
		boolean ePrimo = true, estaNaSequenciaDeFibonacci = false;
		while(exercicio < 41 || exercicio > 60){
			System.out.print("Valor invalido. Digite o numero inteiro (entre 41 e 60, inclusos) do exercicio que voce gostaria de ver: ");
			exercicio = ler.nextInt();
		}
		switch(exercicio){
			case 41:
				/*Enunciado: Solicite ao usuário um número e mostre o fatorial do número informado.*/
				System.out.print("Digite um numero inteiro não negativo: ");
				numeroInteiro = ler.nextInt();
				while(numeroInteiro < 0){
					System.out.print("Numero invalido. Digite um numero inteiro não negativo: ");
					numeroInteiro = ler.nextInt();
				}
				for(int i = 2;i <= numeroInteiro;i++){
					fatorial *= i;
				}
				System.out.printf("O fatorial do numero lido e " + fatorial + ".");
			break;
			case 42:
				/*Enunciado: Construa um programa para mostrar o fatorial dos números inteiros na
				faixa de 1 a 10.*/
				for(int i = 1;i <= 10;i++){
					fatorial *= i;
					System.out.print(fatorial + " ");
				}
			break;
			case 43:
				/*Enunciado: Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial
				desse número.*/
				for(int i = 1;i <= 7;i++){
					System.out.printf("Digite o %do numero inteiro: ", i);
					numeroInteiro = ler.nextInt();
					for(int j = 2;j <= numeroInteiro;j++){
						fatorial *= j;
					}
					System.out.printf("O fatorial do numero lido e " + fatorial + ".\n");
					fatorial = 1;
				}
			break;
			case 44:
				/*Enunciado: Solicite ao usuário a quantidade de termos da sequência de fatoriais e
				imprima o resultado.*/
				System.out.printf("Digite a quantidade de termos da sequencia de fatoriais: ");
				quantidadeDigitada = ler.nextInt();
				for(int i = 1;i <= quantidadeDigitada;i++){
					fatorial *= i;
					System.out.print(fatorial + " ");
				}
			break;
			case 45:
				/*Enunciado: Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima a
				sequência do final para o início.*/
				System.out.printf("Digite a quantidade de termos da sequencia de fatoriais: ");
				quantidadeDigitada = ler.nextInt();
				for(int i = 1;i <= quantidadeDigitada;i++){
					fatorial *= i;
				}
				for(int i = quantidadeDigitada;i >= 1;i--){
					System.out.print(fatorial + " ");
					fatorial /= i;
				}
			break;
			case 46:
				/*Enunciado: Solicite ao usuário um número e verifique se este número é primo ou não.*/
				System.out.print("Digite um numero inteiro: ");
				numeroInteiro = ler.nextInt();
				if(numeroInteiro < 0){
					numeroInteiro = -numeroInteiro;
				}
				if(numeroInteiro == 0 || numeroInteiro == 1){
					ePrimo = false;
				}
				else{
					for(int i = 2;i < numeroInteiro;i++){
						if(numeroInteiro % i == 0){
							ePrimo = false;
						}
					}
				}
				System.out.print("O numero digitado " + ((ePrimo == false) ? "nao " : "") + "e primo");
			break;
			case 47:
				/*Enunciado: Imprima somente os números primos existentes na faixa de um 1 até 100.*/
				for(int i = 2;i <= 100;i++){
					for(int j = 2;j < i;j++){
						if(i % j == 0){
							ePrimo = false;
						}
					}
					System.out.printf((ePrimo == true) ? "%d " : "", i);
					ePrimo = true;
				}
			break;
			case 48:
				/*Enunciado: Solicite ao usuário a quantidade de termos da sequência de números primos e
				imprima o resultado*/
				System.out.printf("Digite a quantidade de termos da sequencia de fatoriais: ");
				quantidadeDigitada = ler.nextInt();
				for(int i = 2;quantidadeImpressos < quantidadeDigitada;i++){
					for(int j = 2;j < i;j++){
						if(i % j == 0){
							ePrimo = false;
						}
					}
					if(ePrimo == true){
						System.out.printf("%d ", i);
						quantidadeImpressos++;
					}
					ePrimo = true;
				}
			break;
			//case 49:
				/*Enunciado: Solicite ao usuário a quantidade de termos da sequência de números primos
				e imprima a sequência do final para o início.*/
				/*System.out.printf("Digite a quantidade de termos da sequencia de fatoriais: ");
				quantidadeDigitada = ler.nextInt();
				for(int i = 2;quantidadeImpressos < quantidadeDigitada;i++){
					for(int j = 2;j < i;j++){
						if(i % j == 0){
							ePrimo = false;
						}
					}
					if(ePrimo == true){
						numerosPrimos[quantidadeImpressos] = i;
						quantidadeImpressos++;
					}
					ePrimo = true;
				}
				for(int i = numerosPrimos.length - 1;i > 0;i++){
					System.out.printf("%d ", i);
				}
			break;
			case 50:
				/*Enunciado: Solicite ao usuário o termo inicial e a quantidade de termos da sequência de
				números primos e imprima o resultado.*/
			//break;
			case 51:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				System.out.print("Digite a quantidade de termos da sequencia de fatoriais: ");
				quantidadeDigitada = ler.nextInt();
				
				for(int i = 0;i < quantidadeDigitada;i++){
					if(i == 0 || i == 1){
						System.out.printf("%d ", i);
					}
					else{
						System.out.printf("%d ", numeroAnterior + numeroRetrasado);
						auxiliar = numeroAnterior;
						numeroAnterior += numeroRetrasado;
						numeroRetrasado = auxiliar;
					}
				}
			break;
			case 52:
				/*Solicite um número inteiro ao usuário e informe se ele pertence a sequência
				de Fibonacci ou não.*/
				System.out.print("Digite um numero inteiro: ");
				numeroInteiro = ler.nextInt();
				for(int i = 0;i < numeroInteiro;i++){
					if(numeroAnterior + numeroRetrasado == numeroInteiro){
						estaNaSequenciaDeFibonacci = true;
					}
					auxiliar = numeroAnterior;
					numeroAnterior += numeroRetrasado;
					numeroRetrasado = auxiliar;
				}
				System.out.print("O numero digitado " + ((estaNaSequenciaDeFibonacci == true) ? "" : "nao ") + "esta na sequencia de Fibonacci");
			break;
			case 53:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 54:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 55:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 56:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 57:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 58:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			case 59:
				/*Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima
				o resultado.*/
				
			break;
			default:
				/*Solicite ao usuário os dois primeiros termos da sequência de Ricci e depois
				solicite a número e verifique se o número informado pertence a sequência de
				Ricci ou não.*/
				
			break;
		}
	}
}
