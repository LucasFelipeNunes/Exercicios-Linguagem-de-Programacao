/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
sos, arara, etc).*/
import java.util.Scanner;
public class Lista7Exercicio19{
	public static void main(String[] args){
		boolean palavraEPalindroma = true;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = ler.nextLine();
		for(int i = 0;(i < palavra.length()) && (palavraEPalindroma == true);i++){
			if(palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1) || palavra.charAt(i) == ' '){
				palavraEPalindroma = false;
			}
		}
		System.out.print("A palavra digitada " + (palavraEPalindroma ? " " : "nao ") + "e palindroma");
	}
}
