/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor AG de dimensão e com
elementos fornecidos pelo usuário e colocar, somente, os elementos PRIMOS
em ordem crescente. Ao final imprimir o vetor AG ordenado.*/
import java.util.Scanner;
import java.util.Arrays;
public class Lista8Exercicio26{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = ler.nextInt();
		int[] vet = new int[quantidade];
		int primos = 0;
		boolean isPrimo = true;

		for(int i = 0;i < quantidade;i++){
			isPrimo = true;
			System.out.print("Digite o elemento da posicao " + i + " do vetor: ");
			vet[i] = ler.nextInt();

			for(int j = 2; j < vet[i]; j++ ){
				if(vet[i] % j == 0){
					isPrimo = false;
				}
			}

			if(isPrimo){
				primos++;
			}
		}

		System.out.println("Primo: " + primos);

		int[] vetPrimos = new int[primos];

		int aux = 0;
		for(int i = 0;i < quantidade;i++){
			isPrimo = true;
			for(int j = 2; j < vet[i]; j++ ){
				if(vet[i] % j == 0){
					isPrimo = false;
				}
			}

			if(isPrimo){
				vetPrimos[aux] = vet[i];
				aux++;
			}
		}

		Arrays.sort(vetPrimos);

		for(int i = 0;i < vetPrimos.length;i++){
			System.out.println("Primo: " + vetPrimos[i]);
		}

		aux = 0;

		for(int i = 0;i < quantidade;i++){
			isPrimo = true;

			for(int j = 2; j < vet[i]; j++ ){
				if(vet[i] % j == 0){
					isPrimo = false;
				}
			}

			if(isPrimo){
				vet[i] = vetPrimos[aux];
				aux++;
			}
		}

        System.out.print("Os elementos do vetor sao: ");

        for(int i = 0;i < quantidade;i++){
            System.out.print(vet[i] + " ");
        }

	}
}
