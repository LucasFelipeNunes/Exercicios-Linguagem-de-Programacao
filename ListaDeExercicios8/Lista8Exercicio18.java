/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para solicitar ao usuário a quantidade de
elementos da sequência de Fatoriais (N<=15) e gerar um vetor Y com os
elementos da sequência e imprimir o vetor.*/
import java.util.Scanner;
public class Lista8Exercicio18 {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int N = 0;
		do{
			System.out.print("Digite a quantidade N de termos da sequencia de fatoriais:\t");
			N = ler.nextInt();
			if(N > 15){
				System.out.print("Valor invalido. ");
			}
		} while(N > 15);
		int[] Y = new int[N];
		System.out.print("Os elementos do vetor Y sao: ");
        for(int i = 1;i <= Y.length;i++){
			Y[i - 1] = 1;
			for(int j = 1;j <= i;j++){
				Y[i - 1] *= j;
			}
			System.out.print(" " + Y[i - 1]);
        }
    }
}
