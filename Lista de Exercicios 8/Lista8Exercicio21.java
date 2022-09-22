/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor AB de 10 posições com elementos
fornecidos pelo usuário. Para cada elemento ímpar encontrado, multiplique ele por
dois, gerando assim um vetor de elementos pares e ao final exiba o resultado.*/
import java.util.Scanner;
public class Lista8Exercicio21{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int[] AB = new int[10];
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor AB: ");
			AB[i] = ler.nextInt();
			if(AB[i] % 2 == 1){
				AB[i] *= 2;
			}
		}
		System.out.print("Os elementos do vetor AB, com os impares mulltiplicados por 2, e ");
		for(int i = 0;i < 10;i++){
			System.out.print(AB[i] + " ");
		}
	}
}
