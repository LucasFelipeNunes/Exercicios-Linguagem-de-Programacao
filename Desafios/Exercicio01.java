import java.util.Scanner;
public class Exercicio01{
	static int somaNotas(int nota1, int nota2){
		int soma = nota1 + nota2;
		return soma;
	}
	public static void main (String[] args) {
		boolean empate = false;
		Scanner lerInt = new Scanner(System.in), lerString = new Scanner(System.in);
		System.out.print("Digite a quantidade de participantes postulantes a premiacao: ");
		int qtdParticipantes = lerInt.nextInt(), 
		melhorNota = 0, auxiliar = 0;
		String[] nomes = new String[qtdParticipantes];
		int[] notasAberturas = new int[qtdParticipantes], notasJogadas = new int[qtdParticipantes];
		String melhorParticipante = " ";
		for(int i = 0;i < qtdParticipantes;i++){
			System.out.print("Digite o nome do " + (i + 1) + "o postulante: ");
			nomes[i] = lerString.nextLine();
			System.out.print("Digite a nota das aberturas do " + (i + 1) + "o postulante: ");
			notasAberturas[i] = lerInt.nextInt();
			System.out.print("Digite a nota das jogadas do " + (i + 1) + "o postulante: ");
			notasJogadas[i] = lerInt.nextInt();
			if(somaNotas(notasAberturas[i], notasJogadas[i]) > melhorNota){
				auxiliar = i;
				melhorNota = somaNotas(notasAberturas[i], notasJogadas[i]);
			}
			else if(somaNotas(notasAberturas[i], notasJogadas[i]) == melhorNota){
				empate = true;
			}
		}
		melhorParticipante = nomes[auxiliar];
		for(int i = 0;i < qtdParticipantes;i++){
			System.out.print("\n" + nomes[i] + "\t" + somaNotas(notasAberturas[i], notasJogadas[i]));
		}
		System.out.print(empate ? "\n\nHouve um empate na competicao" : "\n\nO participante com a melhor nota e " + melhorParticipante);
	}	
}

