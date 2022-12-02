//Nome: Lucas Felipe da Silva Nunes
import java.util.Scanner;
import java.util.Arrays;

public class Lista8Exercicio20{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);

		int[] AA = new int[10];

		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor AA: ");
			AA[i] = ler.nextInt();
		}

		Arrays.sort(AA);

		for(int i = 9;i >=0;i--){
			System.out.print(" " + AA[i]);
			
		}

	}
}
