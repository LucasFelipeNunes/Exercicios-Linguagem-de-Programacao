/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são
NEGATIVOS.*/
import java.util.Scanner;
public class Lista6Exercicio8{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int quantidadeValoresNegativos = 0, valor = 0;
		for(int i = 1;i <= 10;i++){
			System.out.printf("Digite o valor %d: ", i);
			valor = ler.nextInt();
			if(valor < 0){
				quantidadeValoresNegativos++;
			}
		}
		System.out.printf("%d dos valores lidos sao negativos", quantidadeValoresNegativos);
	}
}
