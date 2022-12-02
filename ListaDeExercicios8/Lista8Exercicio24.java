//Nome: Lucas Felipe da Silva Nunes
import java.util.Scanner;
import java.util.Arrays;
public class Lista8Exercicio24{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = ler.nextInt();
		int[] vet = new int[quantidade];
		int impares = 0;


		for(int i = 0;i < quantidade;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor: ");
			vet[i] = ler.nextInt();

			if(vet[i] % 2 != 0){
				impares++;
			}
		}

		int[] vetImpares = new int[impares];

		int aux = 0;
		for(int i = 0;i < quantidade;i++){
			
			if(vet[i] % 2 != 0){
				vetImpares[aux] = vet[i];
				aux++;
			}
		}

		Arrays.sort(vetImpares);


		aux = vetImpares.length-1;

		for(int i = 0;i < quantidade;i++){
			

			if(vet[i] % 2 != 0){
				vet[i] = vetImpares[aux];
				aux--;
			}
		}

        System.out.print("Os elementos do vetor sao: ");

        for(int i = 0;i < quantidade;i++){
            System.out.print(vet[i] + " ");
        }

	}
}
