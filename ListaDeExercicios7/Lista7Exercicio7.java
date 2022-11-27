/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem, onde
consta o caractere e na frente a quantidade de ocorrências. Caso não tenha ocorrência
apresentar o valor zero. Não diferenciar maiúsculo de minúsculo.*/
import java.util.Scanner;
public class Lista7Exercicio7{
	public static void main(String[] args){
		int[] quantidadeLetras = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 97;i < 123;i++){
			for(int j = 0;j < frase.length();j++){
				if(frase.charAt(j) == (char)i || frase.charAt(j) == (char)(i - 32)){
					quantidadeLetras[i - 97]++;
				}
			}
		}
		for(int i = 0;i < 26;i++){
			System.out.printf("\nQuantidade de %c/%c impressos: %d", (char) (i + 65), (char) (i + 97), quantidadeLetras[i]);
		}
	}
}
