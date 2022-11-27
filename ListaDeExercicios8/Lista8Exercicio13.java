/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor de inteiros P de N elementos (N<=10) e
imprimir o vetor lido. Ler outro vetor de inteiros Q de M elementos (M<=15) e imprimir
este vetor lido. Construir outro vetor R com todos os elementos lidos de P e de Q e
imprimir este vetor obtido. (Concatenação)*/
import java.util.Scanner;
public class Lista8Exercicio13{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N = 0, M = 0;
		while(N > 10 || N < 1){
			System.out.print("Digite o numero N, entre 1 e 10, de posicoes que o vetor P tem: ");
			N = ler.nextInt();
			if(N > 10 || N < 1){
				System.out.print("Valor invalido. ");
			}
		}
		while(M > 15 || M < 1){
			System.out.print("Digite o numero M, entre 1 e 15, de posicoes que o vetor Q tem: ");
			M = ler.nextInt();
			if(M > 15 || M < 1){
				System.out.print("Valor invalido. ");
			}
		}
		int[] P = new int[N], Q = new int[M], R = new int[N + M];
		for(int i = 0;i < N;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor P: ");
			P[i] = ler.nextInt();
			R[i] = P[i];
		}
		for(int i = 0;i < M;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor Q: ");
			Q[i] = ler.nextInt();
			R[i + N] = Q[i];
		}
		System.out.print("Os valores do vetor P sao:");
		for(int i = 0;i < N;i++){
			System.out.print(" " + P[i]);
		}
		System.out.print("\nOs valores do vetor Q sao:");
		for(int i = 0;i < M;i++){
			System.out.print(" " + Q[i]);
		}
		System.out.print("\nOs valores do vetor R sao:");
		for(int i = 0;i < N + M;i++){
			System.out.print(" " + R[i]);
		}
	}
}
