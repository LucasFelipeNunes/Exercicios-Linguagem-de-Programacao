/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20),
determinar e imprimir o maior e o menor elemento deste vetor.*/
import java.util.Scanner;
public class Lista8Exercicio7{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N = 0, menorElemento = 0, maiorElemento = 0;
		do{
			System.out.print("Digite o numero n, entre 1 e 20, de posicoes que os vetores tem: ");
			N = ler.nextInt();
			if(N > 20 || N < 1){
				System.out.print("Valor invalido. ");
			}
		}while(N > 20 || N < 1);
		int[] E = new int[N];
		for(int i = 0;i < N;i++){
			System.out.printf("Digite o valor da posicao %d do vetor E: ", i);
			E[i] = ler.nextInt();
			if(i == 0 || menorElemento > E[i]){
				menorElemento = E[i];
			}
			if(i == 0 || maiorElemento < E[i]){
				maiorElemento = E[i];
			}
		}
		System.out.print("O maior elemento do vetor E e " + maiorElemento + " e o menor e " + menorElemento + ".");
	}
}
