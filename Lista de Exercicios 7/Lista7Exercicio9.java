/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário.*/
import java.util.Scanner;
public class Lista7Exercicio9{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int quantidadeEspacos = 0;
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 0;i < frase.length();i++){
			if(frase.charAt(i) == ' '){
				quantidadeEspacos++;
			}
		}
		System.out.print("A quantidade de espacos na frase digitada e " + quantidadeEspacos);
	}
}
