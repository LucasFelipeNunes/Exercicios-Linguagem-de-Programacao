import java.util.Scanner;
import java.util.Arrays;
public class Lista8Exercicio31 {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		
		int N = 0;
		
		while(N < 1 || N > 10) {
			
			System.out.println("Digite um inteiro entre 1 e 10");
			N = ler.nextInt();
		}
		
		String[] AM = new String[N];
		
		for(int i = 0;i < N;i++){
			System.out.print("Digite o elemento que vai ficar na posicao " + i + " do vetor AM: ");
			AM[i] = lerString.nextLine();
		}
		System.out.print("Os elementos do vetor AM sao: ");
		for(int i = 0;i < N;i++){
			System.out.print(" " + AM[i]);
		}
		System.out.print("\nOs elementos do vetor AM, em ordem crescente, sao: ");
		
		Arrays.sort(AM);
		
		for(int i = 0;i < N;i++){
			System.out.print(" " + AM[i]);
		}
	
	}
}
