/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a
20 e imprimir seus elementos. O usuário deve informar o número de posições e os
elementos.*/
import java.util.Scanner;
public class Lista8Exercicio3{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String[] C = new String[15];
		System.out.printf("Digite o numero N de posicoes que o vetor tem: ");
		int N = ler.nextInt();
		for(int i = 0;i < N;i++){
			System.out.printf("Digite o valor da posicao %d do vetor: ", i);
			C[i] = ler.nextLine();
		}
		System.out.print("Os elementos do vetor C sao: ");
		for(int i = 0;i < N;i++){
			System.out.print(C[i] + " ");
		}
	}
}
