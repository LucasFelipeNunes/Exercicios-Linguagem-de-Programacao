/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
Ao final da execução a mensagem 'NOVO CALCULO (S/N)?' deve ser apresentada. Se for respondido 'S' deve
retornar e executar um novo cálculo, caso contrário deverá encerrar o programa*/
import java.util.Scanner;
public class Lista6Exercicio17{
	public static void main (String args[]){
		String stringNovoCalculo = "S";
		char novoCalculo = stringNovoCalculo.charAt(0);
		while(novoCalculo == 'S'){
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite a nota da 1a avaliacao: ");
			double nota1 = ler.nextDouble();
			while(nota1 < 0 || nota1 > 10){
				System.out.print("Valor invalido. Digite a nota (entre 0 e 10) da 1a avaliacao: ");
				nota1 = ler.nextDouble();
			}
			System.out.print("Digite a nota da 2a avaliacao: ");
			double nota2 = ler.nextDouble();
			while(nota2 < 0 || nota2 > 10){
				System.out.print("Valor invalido. Digite a nota (entre 0 e 10) da 2a avaliacao: ");
				nota2 = ler.nextDouble();
			}
			double mediaSimples = (nota1 + nota2)/2;
			System.out.print("A media simples deste aluno e " + mediaSimples + "\n\nNOVO CALCULO (S/N)? ");
			stringNovoCalculo = ler.nextLine();
			novoCalculo = stringNovoCalculo.charAt(0);
			while(novoCalculo != 'S' && novoCalculo != 'N'){
				System.out.print("Opcao inexistente.\nNOVO CALCULO (S/N)? ");
				stringNovoCalculo = ler.nextLine();
				novoCalculo = stringNovoCalculo.charAt(0);
			}
		}
	}
}
