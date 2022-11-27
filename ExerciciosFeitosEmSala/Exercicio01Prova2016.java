import java.util.Scanner;
public class Exercicio01Prova2016 {
	public static void main (String[] args) {
		Scanner lerInt = new Scanner(System.in);
		int quantidade = 0;
		do{
			int numeroPassado = 1, numeroRetrasado = 0;
			System.out.print("\nEntre com a quantidade de termos da sequência de Fibonacci: ");
			quantidade = lerInt.nextInt();
			if(quantidade < 0){
				System.out.print("Quantidade inválida!");
			}
			else if(quantidade == 0){
				System.out.print("Fim do programa!");
			}
			else if(quantidade == 1){
				System.out.print("0");
			}
			else{
				int[] vetor = new int[quantidade];
				vetor[0] = numeroRetrasado;
				vetor[1] = numeroPassado;
				for(int i = 0;i < quantidade;i++){
					switch(i){
						case 0:
							vetor[0] = numeroRetrasado;
							break;
						case 1:
							vetor[1] = numeroPassado;
							break;
						default:
							vetor[i] = numeroPassado + numeroRetrasado;
							numeroRetrasado = numeroPassado;
							numeroPassado = vetor[i];
					}
				}
				for(int i = (quantidade - 1);i >= 0;i--){
					System.out.print(vetor[i] + " ");
				}
			}
		}while(quantidade != 0);
	}
}
