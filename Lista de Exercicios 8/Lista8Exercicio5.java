/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler 2 vetores de dimensão n (n<=15) e calcular a soma
entre eles gerando um terceiro vetor de mesma dimensão.*/
import java.util.Scanner;
public class Lista8Exercicio5{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int n = 0;
		do{
			System.out.print("Digite o numero n, entre 1 e 15, de posicoes que os vetores tem: ");
			n = ler.nextInt();
			if(n > 15 || n < 1){
				System.out.print("Valor invalido. ");
			}
		}while(n > 15 || n < 1);
		double[] vetor1 = new double[n], vetor2 = new double[n], vetorSoma = new double[n];
		for(int i = 0;i < n;i++){
			System.out.printf("Digite o valor da posicao %d do primeiro vetor: ", i);
			vetor1[i] = ler.nextDouble();
		}
		for(int i = 0;i < n;i++){
			System.out.printf("Digite o valor da posicao %d do segundo vetor: ", i);
			vetor2[i] = ler.nextDouble();
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}
		System.out.print("Os elementos do vetor soma sao: ");
		for(int i = 0;i < n;i++){
			System.out.print(vetorSoma[i] + " ");
		}
	}
}
