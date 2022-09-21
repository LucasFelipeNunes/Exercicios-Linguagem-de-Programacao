/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor A de 15 posições e imprimir seus
elementos.*/
import java.util.Scanner;
public class Lista8Exercicio1{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String[] A = new String[15];
		for(int i = 0;i < 15;i++){
			System.out.printf("Digite o valor da posicao %d do vetor: ", i);
			A[i] = ler.nextLine();
		}
		System.out.print("Os elementos do vetor A sao: ");
		for(int i = 0;i < 15;i++){
			System.out.print(A[i] + " ");
		}
	}
}
