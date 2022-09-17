/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
soma dos termos.
2/1 - 4/3 + 6/5 - 8/7 + 10/9 - 12/11 + ...*/
import java.util.Scanner;
public class Lista6Exercicio62{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos impressos: ");
		int quantidadeTermos = ler.nextInt();
		double soma = 0;
		for(int i = 0;i < quantidadeTermos * 2;i += 2){
			System.out.printf("%d/%d ", i + 2, i + 1);
			if(i < 2 * (quantidadeTermos - 1)){
				if(i % 4 == 0){
					System.out.printf("- ", i + 2, i + 1);
					soma += (double) (i + 2) / (double) (i + 1);
				}
				else{
					System.out.printf("+ ", i + 2, i + 1);
					soma -= (double) (i + 2) / (double) (i + 1);
				}
			}
			else{
				if(i % 2 == 0){
					soma += (double) (i + 2) / (double) (i + 1);
				}
				else{
					soma -= (double) (i + 2) / (double) (i + 1);
				}
			}
		}
		System.out.print("\nA soma dos termos impressos e " + soma);
	}
}
