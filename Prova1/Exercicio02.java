//Nome: Lucas Felipe da Silva Nunes
import java.util.Scanner;
public class Exercicio02{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Menu de Frutas\nCodigo\tNome\n0\tSair\n1\tBanana\n2\tMaca\n3\tMorango\n4\tAbobora\n5\tAtemoia\n6\tUva\n7\tTomate\n8\tPera\n9\tLaranja\n10\tLimao\nDigite o codigo da fruta que voce quer:\t");
		int codigo = ler.nextInt();
		switch(codigo){
			case 0:
				System.out.print("Voce escolheu neste dia nenhuma fruta.");
				break;
			case 1:
				System.out.print("Voce escolheu neste dia a banana.");
				break;
			case 2:
				System.out.print("Voce escolheu neste dia a maca.");
				break;
			case 3:
				System.out.print("Voce escolheu neste dia o morango.");
				break;
			case 4:
				System.out.print("Voce escolheu neste dia a abobora.");
				break;
			case 5:
				System.out.print("Voce escolheu neste dia a atemoia.");
				break;
			case 6:
				System.out.print("Voce escolheu neste dia a uva.");
				break;
			case 7:
				System.out.print("Voce escolheu neste dia o tomate.");
				break;
			case 8:
				System.out.print("Voce escolheu neste dia a pera.");
				break;
			case 9:
				System.out.print("Voce escolheu neste dia a laranja.");
				break;
			case 10:
				System.out.print("Voce escolheu neste dia o limao.");
				break;
			default:
				System.out.print("Opcao invalida.");
		}
	}
}
