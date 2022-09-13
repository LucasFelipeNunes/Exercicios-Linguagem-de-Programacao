/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.*/
import java.util.Scanner;
public class Lista5Exercicio8{
	public static void main (String args[]){
		int horaInicio = 0, horaFim = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a hora inteira de inicio do jogo de Xadrez: ");
		horaInicio = ler.nextInt();
		while(horaInicio < 0 || horaInicio >= 24){
			System.out.print("Valor inválido. Digite a hora inteira de inicio do jogo de Xadrez: ");
			horaInicio = ler.nextInt();
		}
		System.out.print("Digite a hora inteira de fim do jogo de Xadrez: ");
		horaFim = ler.nextInt();
		while(horaFim < 0 || horaFim >= 24){
			System.out.print("Digite a hora inteira de fim do jogo de Xadrez: ");
			horaInicio = ler.nextInt();
		}
		if(horaFim > horaInicio){
			System.out.print("O tempo de duracao do jogo, em horas, foi " + (horaFim - horaInicio));
		}
		else{
			System.out.print("O tempo de duracao do jogo, em horas, foi " + (24 - horaInicio + horaFim));
		}
	}
}
