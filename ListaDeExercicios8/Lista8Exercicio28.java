
import java.util.Scanner;
public class Lista8Exercicio28{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N = 0;
		int[] AH = new int[25];
		for(int i = 0; i < AH.length; i++){
			System.out.print("Digite o " + (i+1) + "o valor do vetor AH:");
			AH[i] = ler.nextInt();
		}
		do{
			System.out.print("Digite a quantidade, entre 2 e 5, de elementos do vetor AI:\t");
			N = ler.nextInt();
			if(N < 2 || N > 5){
				System.out.print("Valor invalido. ");
			}
		}while(N < 2 || N > 5);
		int[] AI = new int[N];

		for(int i = 0; i < AI.length; i++){
			AI[i] = (int)(Math.random() * 10);
		}
		boolean exists = false;
		String comeca = "";
		for(int i = 0; i < AH.length; i++){
			if(i >= AI.length - 1){
				boolean contem = true;
				int aux = 0;
				for(int j = N-1 ; j >= 0; j--){
					if(AH[i - j] != AI[aux]){
						contem = false;
						aux++;
					}
				}
				if(contem){
					exists = true;
					comeca += " " + i;
				}
			}
		}
		System.out.print("Vetor AH:\t");
		for(int i = 0; i < AH.length; i++){
			System.out.print(" " + AH[i]);
		}
		System.out.println("\nVetor AI:\t");
		for(int i = 0; i < AI.length; i++){
			System.out.print(" " + AI[i]);
		}
		System.out.println((comeca != "") ? "\nO vetor comeca no: " + comeca : "\nNao contem");
	}
}
