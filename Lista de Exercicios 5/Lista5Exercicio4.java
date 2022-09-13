/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.*/
import java.util.Scanner;
public class Lista5Exercicio4{
	public static void main (String args[]){
		double primeiraNota = 0, segundaNota = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a nota, entre 0 e 10, da primeira avaliacao: ");
		primeiraNota = ler.nextDouble();
		while(primeiraNota < 0 || primeiraNota > 10){
			System.out.print("Valor inválido. Digite a nota da primeira avaliacao: ");
			primeiraNota = ler.nextDouble();
		}
		System.out.print("Digite a nota da segunda avaliacao: ");
		segundaNota = ler.nextDouble();
		while(segundaNota < 0 || segundaNota > 10){
			System.out.print("Valor inválido. Digite a nota da segunda avaliacao: ");
			segundaNota = ler.nextDouble();
		}
		double mediaAritmetica = (primeiraNota + segundaNota)/2;
		if(mediaAritmetica >= 6){
			System.out.print("O aluno foi aprovado");
		}
		else{
			System.out.print("O aluno foi reprovado");
		}
	}
}
