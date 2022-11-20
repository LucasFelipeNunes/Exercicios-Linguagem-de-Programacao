import java.util.Scanner;
public class Exercicio02{
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int indice = 0, diagonalPrincipal = 0, diagonalSecundaria = 0;
		do{
			System.out.print("Digite o indice da matriz quadrada:\t");
			indice = ler.nextInt();
			if(indice < 0){
				System.out.print("Valor invalido. ");
			}
		}while(indice < 0);
		int[][] matriz = new int[indice][indice];
		for(int i = 0;i < indice;i++){
			for(int j = 0;j < indice;j++){
				matriz[i][j] = (int) (Math.random() * 15);
				System.out.print(matriz[i][j] + "\t");
				if(i == j){
					diagonalPrincipal += matriz[i][j];
				}
				if(i + j + 1 == indice){
					diagonalSecundaria += matriz[i][j];
				}
			}
			System.out.println();
		}
		System.out.print("\nDiagonal principal:\t" + diagonalPrincipal + "\nDiagonal secundaria:\t" + diagonalSecundaria + "\nDiferenca absoluta:\t" + ((diagonalPrincipal < diagonalSecundaria) ? diagonalSecundaria - diagonalPrincipal : diagonalPrincipal - diagonalSecundaria));
	}
}
