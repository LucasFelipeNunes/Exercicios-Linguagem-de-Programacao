/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para solicitar ao usuário a quantidade de elementos da
sequência de Primos (N<=20) e gerar um vetor X com os elementos da sequência e
imprimir o vetor.*/
import java.util.Scanner;
public class Lista8Exercicio17{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean ePrimo = true;
		int quantidadeElementosPrimos = 0, quantidadeImpressos = 0;
		while(quantidadeElementosPrimos > 20 || quantidadeElementosPrimos < 1){
			System.out.print("Digite o numero N, entre 1 e 20, de posicoes que o vetor P tem: ");
			quantidadeElementosPrimos = ler.nextInt();
			if(quantidadeElementosPrimos > 20 || quantidadeElementosPrimos < 1){
				System.out.print("Valor invalido. ");
			}
		}
		int[] X = new int[quantidadeElementosPrimos];
		for(int i = 2;quantidadeImpressos < quantidadeElementosPrimos;i++){
			for(int j = 2;j < i;j++){
				if(i % j == 0){
					ePrimo = false;
				}
			}
			if(ePrimo == true){
				X[quantidadeImpressos] = i;
				quantidadeImpressos++;
			}
			ePrimo = true;
		}
		System.out.print("Os elementos do vetor X sao:");
		for(int i = 0;i < quantidadeElementosPrimos;i++){
			System.out.print(" " + X[i]);
		}
	}
}
		
