/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números aleatórios
entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve
exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
exibida.*/
public class VerificaValorProdutoRandom {
	public static void main (String[] args) {
		double precoProduto1 = Math.random() * 1000D, precoProduto2 = Math.random() * 1000D;
		if(precoProduto1 < precoProduto2)
		{
			System.out.println("O produto 1 e o mais barato");
		}
		else if(precoProduto2 < precoProduto1)
		{
			System.out.println("O produto 2 e o mais barato");
		}
		else
		{
			System.out.println("Os preços dos dois produtos são iguais");
		}
	}
}
