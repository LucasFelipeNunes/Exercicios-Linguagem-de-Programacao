/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor de inteiros S de 10 elementos e
imprimir o vetor lido. Ler outro vetor de inteiros T de 15 elementos e
imprimir este vetor lido. Construir outro vetor U com todos os elementos
lidos de S e de T e imprimir este vetor obtido. (Intercalação)*/
import java.util.Scanner;
public class Lista8Exercicio14{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int[] S = new int[10], T = new int[15], U = new int[25];
		int contadorS = 0, contadorT = 0;
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o valor do elemento " + (i + 1) + " do vetor S:\t");
			S[i] = ler.nextInt();
		}
		for(int i = 0;i < 15;i++){
			System.out.print("Digite o valor do elemento " + (i + 1) + " do vetor T:\t");
			T[i] = ler.nextInt();
		}
		System.out.print("Valores do vetor U: ");
		for(int i = 0;i < 25;i++){
			if(i % 5 == 1 || i % 5 == 3){
				U[i] = S[contadorS];
				contadorS++;
			}
			else{
				U[i] = T[contadorT];
				contadorT++;
			}
			System.out.print(" " + U[i]);
		}
	}
}
