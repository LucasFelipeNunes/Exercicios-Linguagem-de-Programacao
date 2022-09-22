/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e
imprimir os vetores lidos. Construir outro vetor QC de tamanho 10, com todos os
elementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)*/
import java.util.Scanner;
public class Lista8Exercicio11{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int[] QA = new int[5], QB = new int[5], QC = new int[10];
		for(int i = 0;i < 5;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor QA: ");
			QA[i] = ler.nextInt();
			QC[i * 2] = QA[i];
		}
		for(int i = 0;i < 5;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor QB: ");
			QB[i] = ler.nextInt();
			QC[i * 2 + 1] = QB[i];
		}
		System.out.print("Os elementos do vetor QC sao:");
		for(int i = 0;i < 10;i++){
			System.out.print(" " + QC[i]);
		}
	}
}
