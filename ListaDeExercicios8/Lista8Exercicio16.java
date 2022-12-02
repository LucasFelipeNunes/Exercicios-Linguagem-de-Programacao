//Nome: Lucas Felipe da Silva Nunes
import java.util.Scanner;
public class Lista8Exercicio16{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = ler.nextInt();
		int anterior = 1;

        if(quantidade <= 20 && quantidade >= 1){
            int[] fibonacci = new int[quantidade];
			fibonacci[0] = 0;
			if(quantidade >= 2){
				fibonacci[1] = 1;
			}


            for(int i = 2;i < quantidade;i++){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }

            System.out.print("Os elementos do vetor fibonacci sao: ");
            for(int i = 0;i < quantidade;i++){
                System.out.print(fibonacci[i] + " ");
            }

        } else {
            System.out.print("Quantidade de elementos invalida");
        }
    }
}
