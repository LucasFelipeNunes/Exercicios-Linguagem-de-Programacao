/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor de inteiros S de N elementos (N<=10) e
imprimir o vetor lido. Ler outro vetor de inteiros T de M elementos (M<=15) e imprimir
este vetor lido. Construir outro vetor U com todos os elementos lidos de S e de T e
imprimir este vetor obtido. (Intercalação)*/
import java.util.Scanner;
public class Lista8Exercicio15{
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
		int[] S = new int[N], T = new int[M], U = new int[N + M];
		for(int i = 0;i < N;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor S: ");
			S[i] = ler.nextInt();
			U[i] = S[i];
		}
		for(int i = 0;i < M;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor T: ");
			T[i] = ler.nextInt();
			U[i + N] = T[i];
		}
		System.out.print("Os valores do vetor S sao:");
		for(int i = 0;i < N;i++){
			System.out.print(" " + S[i]);
		}
		System.out.print("\nOs valores do vetor T sao:");
		for(int i = 0;i < M;i++){
			System.out.print(" " + T[i]);
		}
		System.out.print("\nOs valores do vetor U sao:");
		for(int i = 0;i < N + M;i++){
			System.out.print(" " + U[i]);
		}
	}
}
