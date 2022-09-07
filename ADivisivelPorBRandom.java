/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que
guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000
(inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for
divisível por b ou a mensagem Não é divisível, caso contrário*/
public class ADivisivelPorBRandom {
	public static void main (String[] args) {
		int a = (int)(Math.random() * 1000D), b = (int)(Math.random() * 20D);
		if(a%b == 0)
		{
			System.out.println("E divisivel");
		}
		else
		{
			System.out.println("Nao e divisivel");
		}
	}
}
