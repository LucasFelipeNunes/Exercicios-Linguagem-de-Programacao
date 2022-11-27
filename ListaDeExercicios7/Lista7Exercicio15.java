/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que informe se em uma frase fornecida pelo usuário existem
caracteres numéricos.*/
import java.util.Scanner;
public class Lista7Exercicio15{
	public static void main(String[] args){
		boolean existemCaracteresNumericos = false;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 48;(i < 58) && (existemCaracteresNumericos == false);i++){
			for(int j = 0;(j < frase.length()) && (existemCaracteresNumericos == false);j++){
				if(frase.charAt(j) == (char)i){
					existemCaracteresNumericos = true;
				}
			}
		}
		System.out.print(((existemCaracteresNumericos) ? "E" : "Nao e") + "xistem caracteres numericos na frase digitada");
	}
}
