/*Alunos:	Lucas Felipe da Silva Nunes
			Luiz Gustavo Duarte Chagas*/
import java.util.Scanner;
public class Exercicio2{
	public static void main (String[] args) {
		String novamente = "";
		Scanner ler = new Scanner(System.in);
		do{
			int contador = 1, aux = 0;
			int qtdDiferencas = 0;
			boolean[] vetor = new boolean[(int)(Math.random() * 20) + 1];
			int[][] vetorNumerico = new int[vetor.length][2];
			for (int i = 0; i < vetor.length; i++)
			{
				aux = (int) (Math.random() * 2);
				vetor[i] = (aux == 1) ? true : false;
				if(i >= 1){
					if(vetor[i] == vetor[i - 1]){
						contador++;
					}
					else{
						vetorNumerico[qtdDiferencas][0] = (vetor[i-1]) ? 1 : 0;
						vetorNumerico[qtdDiferencas][1] = contador;
						contador = 1;
						qtdDiferencas++;
					}
				}
				vetorNumerico[qtdDiferencas][0] = (vetor[i]) ? 1 : 0;
				vetorNumerico[qtdDiferencas][1] = contador;
				if(contador == vetor.length){
					vetorNumerico[0][0] = (vetor[i]) ? 1 : 0;
					vetorNumerico[0][1] = contador;
				}
			}
			for (int i = 0; i < vetor.length; i++)
			{
				System.out.print(vetor[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < vetor.length; i++)
			{
				//Mostrar somente as posicoes validas
				if(vetorNumerico[i][1] > 0){
					System.out.print(vetorNumerico[i][0] + ", " + vetorNumerico[i][1] + ", ");
				}
			}
			do{
				System.out.print("Executar novamente [S/N]: ");
				novamente = ler.nextLine();
			}while(novamente.charAt(0) != 'S' && novamente.charAt(0) != 'N' && novamente.charAt(0) != 's' && novamente.charAt(0) != 'n');
		}while(novamente.charAt(0) == 'S' || novamente.charAt(0) == 's');
		System.out.print("Fim!");
	}
}
