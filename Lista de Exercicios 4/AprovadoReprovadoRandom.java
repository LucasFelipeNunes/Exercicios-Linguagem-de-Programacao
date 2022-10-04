/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie m arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com
valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário*/
public class AprovadoReprovadoRandom {
	public static void main (String[] args) {
		double nota = Math.random() * 10D;
		if(nota < 6)
		{
			System.out.println("REPROVADO");
		}
		else
		{
			System.out.println("APROVADO");
		}
	}
}
