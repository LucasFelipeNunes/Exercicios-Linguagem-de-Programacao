/*Nome: Lucas Felipe da Silva Nunes
Enunciado:  Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores
lidos.*/
import java.util.Scanner;
public class Lista6Exercicio11{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double mediaNotasAlunos = 0, nota = 0;
		System.out.print("Digite a quantidade de alunos: ");
		int quantidadeAlunos = ler.nextInt();
		for(int i = 1;i <= quantidadeAlunos;i++){
			System.out.printf("Digite a nota do aluno %d: ", i);
			nota = ler.nextDouble();
			mediaNotasAlunos += nota/quantidadeAlunos;
		}
		System.out.printf("A media aritmetica das notas dos alunos e %f", mediaNotasAlunos);
	}
}
