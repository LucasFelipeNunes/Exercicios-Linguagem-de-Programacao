/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Solicite ao usuário a quantidade de termos que ele deseja e imprima a sequência abaixo e a
soma dos termos.
1/2 - 1/3 + 2/5 - 3/7 + 5/11 - 8/13 + ...*/
import java.util.Scanner;
public class Lista6Exercicio64{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos impressos: ");
		int quantidadeTermos = ler.nextInt(), numeroAnterior = 1, numeroRetrasado = 0, auxiliar = 0, numeroPrimo = 1;
		boolean ePrimo = false;
		double soma = 0.5;
		for(int i = 0;i < quantidadeTermos;i++){
			if(i == 0){
				System.out.print(numeroAnterior + "/" + 2 + " - ");
			}
			else{
				System.out.print(numeroAnterior + numeroRetrasado);
				auxiliar = numeroAnterior;
				numeroAnterior += numeroRetrasado;
				numeroRetrasado = auxiliar;
				for(int j = numeroPrimo + 1;true;j++){
					for(int k = 2;k < j;k++){
						if(j % k == 0){
							ePrimo = false;
						}
					}
					if(ePrimo == true){
						numeroPrimo = j;
						System.out.printf("/" + numeroPrimo);
						if(i < quantidadeTermos - 1){
							if(i % 2 == 0){
								System.out.print(" - ");
								soma += (double) numeroAnterior / (double) numeroPrimo;
							}
							else{
								System.out.print(" + ");
								soma -= (double) numeroAnterior / (double) numeroPrimo;
							}
						}
						break;
					}
					else{
						ePrimo = true;
					}
				}
			}
		}
		System.out.print("\nA soma dos termos impressos e " + soma);
	}
}
