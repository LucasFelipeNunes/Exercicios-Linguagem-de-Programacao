/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor AF de dimensão definida e com elementos
fornecidos pelo usuário e ordenar crescente de forma crescente os elementos IMPARES
e decrescente os elementos PARES. Ao final imprimir o vetor AF ordenado.*/
import java.util.Scanner;
public class Lista8Exercicio25{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int auxiliar = 0;
		int[] AF = new int[10];
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor AF: ");
			AF[i] = ler.nextInt();
		}
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				if(AF[i] > AF[j] && AF[i] % 2 == 0 && AF[j] % 2 == 0){
					auxiliar = AF[j];
					AF[j] = AF[i];
					AF[i] = auxiliar;
				}
				else if(AF[i] < AF[j] && AF[i] % 2 == 1 && AF[j] % 2 == 1){
					auxiliar = AF[j];
					AF[j] = AF[i];
					AF[i] = auxiliar;
				}
			}
		}
		System.out.print("Os elementos do vetor AF, com os valores pares em ordem decrescente e os impares em ordem crescente, e");
		for(int i = 0;i < 10;i++){
			System.out.print(" " + AF[i]);
		}
	}
}
