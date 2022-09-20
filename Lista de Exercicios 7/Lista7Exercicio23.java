/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Elabore um programa para obter o nome completo de uma pessoa e a seguir forneça o
sobrenome do nome completo informado. Por exemplo, para o nome completo: Omero
Francisco Bertol, o programa deverá fornecer como resultado: Bertol.*/
import java.util.Scanner;
public class Lista7Exercicio23{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o nome completo de uma pessoa: ");
		String nomeCompleto = ler.nextLine(), sobrenome = "";
		for(int i = nomeCompleto.length() - 1;nomeCompleto.charAt(i) != ' ';i--){
			sobrenome += nomeCompleto.charAt(i);
		}
		System.out.print("O sobrenome desta pessoa e ");
		for(int i = sobrenome.length() - 1;i >= 0;i--){
			System.out.print(sobrenome.charAt(i));
		}
	}
}
