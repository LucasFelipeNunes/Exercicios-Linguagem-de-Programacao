/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler um vetor AC de N posições, onde N é
menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
número de posições e um número máximo para o tamanho dos elementos. O
programa deve validar a entrada dos dados e imprimir o vetor ao final.*/
import java.util.Scanner;
public class Lista8Exercicio22{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in), lerString = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a quantidade N menor ou igual a 20 de elementos no vetor AC:\t");
			N = ler.nextInt();
			if(N > 20){
				System.out.print("Valor invalido. ");
			}
		} while(N > 20);
		String[] AC = new String[N];
		System.out.print("Digite o numero maximo para o tamanho dos elementos:\t");
		int tamanhoMaximo = ler.nextInt();
		for(int i = 0;i < AC.length;i++){
			do{
				System.out.print("Digite o elemento na posicao " + (i + 1) + " do vetor AC:\t");
				AC[i] = lerString.nextLine();
				if(AC[i].length() > tamanhoMaximo){
					System.out.print("Valor invalido. ");
				}
			} while(AC[i].length() > tamanhoMaximo);
		}
		System.out.print("Os elementos do vetor AC sao:");
		for(int i = 0;i < AC.length;i++){
			System.out.print(" " + AC[i]);
		}
	}
}
