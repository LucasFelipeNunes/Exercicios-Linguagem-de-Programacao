import java.util.Scanner;
public class Exercicio01{
	public static void main (String[] args) {
		Scanner lerInt = lerString = new Scanner(System.in);
		System.out.print("Digite a quantidade de paricipantes: ");
		int qtdParticipantes = ler.nextInt();
		int[] pontuacaoAbertura = pontuacaoJogada = new int[];
		for(int i = 0;i < qtdParticipantes;i++){
			System.out.print("Digite o nome do jogador " + (i + 1) + " competindo para melhor abertura: ");
			
			System.out.print("Digite a pontuação deste participante no quesito \"Melhor Abertura\"  (entre 0 e 10): ");
			pontuacaoAberturas[i] = lerInt.nextInt();
			System.out.print("Digite a pontuação deste participante no quesito \"Melhor Jogada\" (entre 0 e 10): ");
		}
	}
}
