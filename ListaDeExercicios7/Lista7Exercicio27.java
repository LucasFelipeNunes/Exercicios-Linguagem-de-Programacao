/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa para solicitar ao usuário duas Strings. Se forem de mesmo tamanho,
concatenar seus caracteres, caso contrário, informar ao usuário.
Ex:

Entrada 1: banana
Entrada 2: uva
Saída: Erro! Entradas de tamanhos diferentes.

Entrada 1: bananas
Entrada 2: pitanga
Saída: bpaintaannagsa*/
import java.util.Scanner;
public class Lista7Exercicio27{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra1 = ler.nextLine();
		System.out.print("Digite outra palavra: ");
		String palavra2 = ler.nextLine();
		if(palavra1.length() != palavra2.length()){
			System.out.print("Erro! Entradas de tamanhos diferentes.");
		}
		else{
			for(int i = 0;i < palavra1.length();i++){
				System.out.printf("%c%c", palavra1.charAt(i), palavra2.charAt(i));
			}
		}
	}
}
