/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para criar um vetor AJ de dimensão definida pelo usuário
(>=10) e gerar os elementos aleatórios e não repetidos. Ordenar crescente. O usuário
deverá, em 10 tentativas, descobrir um elemento do vetor. Caso acerte, o programa
deverá imprimir o vetor AJ e a posição onde o elemento do usuário estava. Uma dica
importante para aumentar a "emocao" e a dificuldade é colocar um aleatório grande.*/
import java.util.Scanner;
public class Lista8Exercicio31{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		while(N > 10){
			System.out.print("Digite o numero menor ou igual a 10 posicoes que o vetor AJ tem: ");
			N = ler.nextInt();
			if(N < 10){
				System.out.print("Valor invalido. ");
			}
		}
		String[] AM = new String[N];
		for(int i = 0;i < N;i++){
			System.out.print("Digite o elemento que vai ficar na posicao " + i + " do vetor AM: ");
			AM[i] = ler.nextLine();
		}
		System.out.print("Os elementos do vetor AM sao: ");
		for(int i = 0;i < N;i++){
			System.out.print(" " + AM[i]);
		}
		System.out.print("\nOs elementos do vetor AM, em ordem crescente, sao: ");
	}
}
