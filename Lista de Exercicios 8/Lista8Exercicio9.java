/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir
um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido.
Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste
caso, mostrar uma mensagem e encerrar o programa.*/
import java.util.Scanner;
public class Lista8Exercicio9{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int[] G = new int[5], H = new int[] {1, 1, 1, 1, 1};
		int contadorNumerosPares = 0;
		for(int i = 0;i < 5;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor G: ");
			G[i] = ler.nextInt();
			if(G[i] % 2 == 0){
				H[i] = G[i];
				contadorNumerosPares++;
			}
		}
		if(contadorNumerosPares == 0){
			System.out.print("Nao ha elementos pares no vetor G.");
		}
		else{
			System.out.print("Os elementos do vetor H sao: ");
			for(int i = 0;i < 5;i++){
				if(H[i] != 1){
					System.out.print(H[i] + " ");
				}
			}
		}
	}
}
