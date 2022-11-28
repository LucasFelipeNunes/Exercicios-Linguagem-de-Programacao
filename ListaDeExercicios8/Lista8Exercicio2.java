import java.util.Scanner;
public class Lista8Exercicio2{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String[] B = new String[15];
		for(int i = 0;i < 15;i++){
			System.out.printf("Digite o valor da posicao %d do vetor: ", i);
			B[i] = ler.nextLine();
		}
		System.out.print("Os elementos do vetor B sao: ");
		for(int i = 14;i >= 0;i--){
			System.out.print(B[i] + " ");
        }
	}
}