/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.*/
import java.util.Scanner;
public class Lista7Exercicio11{
	public static void main(String[] args){
		int quantidadeCaracteresAlfabeticos = 0, quantidadeDigitosNumericos = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 97;i < 123;i++){
			for(int j = 0;j < frase.length();j++){
				if(frase.charAt(j) == (char)i || frase.charAt(j) == (char)(i - 32)){
					quantidadeCaracteresAlfabeticos++;
				}
				if(i > 96 && i < 107 && frase.charAt(j) == (char)(i - 49)){
					quantidadeDigitosNumericos++;
				}
			}
		}
		System.out.print("A quantidade de caracteres alfabeticos na frase digitada e " + quantidadeCaracteresAlfabeticos + " e a quantidade de digitos numericos e " + quantidadeDigitosNumericos);
	}
}
