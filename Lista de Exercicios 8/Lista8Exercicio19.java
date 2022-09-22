/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor Z de 10 posições com elementos
fornecidos pelo usuário e colocar os elementos em ordem crescente. Ao final imprimir
o vetor Z ordenado.*/
import java.util.Scanner;
public class Lista8Exercicio19{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int[] Z = new int[10];
		int auxiliar = 0;
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor Z: ");
			Z[i] = ler.nextInt();
		}
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				if(Z[i] < Z[j]){
					auxiliar = Z[j];
					Z[j] = Z[i];
					Z[i] = auxiliar;
				}
			}
		}
		System.out.print("Os elementos do vetor Z, em ordem crescente, sao:");
		for(int i = 0;i < 10;i++){
			System.out.print(" " + Z[i]);
		}
	}
}
