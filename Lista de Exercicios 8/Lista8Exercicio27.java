/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor AH de dimensão definida e com
elementos fornecidos pelo usuário (>=25). Criar outro vetor AI (2 <= N <= 5)
posições e gerar os elementos. Verificar se o vetor AI está contido no vetor AH. Caso
não esteja contido dar mensagem de erro. Caso esteja, informar a posição inicial no
vetor AH.*/
import java.util.Scanner;
public class Lista8Exercicio27{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean estaContido = false;
		int posicaoInicial = 0;
		int[] AH = new int[25], AI = new int[2];
		for(int i = 0;i < 25;i++){
			System.out.print("Digite o elemento " + i + " do vetor AH: ");
			AH[i] = ler.nextInt();
		}
		for(int i = 0;i < 2;i++){
			estaContido = false;
			System.out.print("Digite o elemento " + i + " do vetor AI: ");
			AI[i] = ler.nextInt();
			for(int j = 0;j < 25;j++){
				if(AH[j] == AI[i]){
					estaContido = true;
					if(i == 0 || j < posicaoInicial){
						posicaoInicial = j;
					}
				}
			}
		}
		if(estaContido == true){
			System.out.print("O vetor AI esta contido no vetor AH, e sua posicao inicial nele e " + posicaoInicial);
		}
		else{
			System.out.print("O vetor AI nao esta contido no vetor AH.");
		}
	}
}
