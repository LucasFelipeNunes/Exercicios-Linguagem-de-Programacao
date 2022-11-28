import java.util.Scanner;

public class Lista8Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = ler.nextInt();

        if(quantidade <= 20 && quantidade >= 1){
            String[] A = new String[quantidade];


            for(int i = 0;i < quantidade;i++){
                System.out.printf("Digite o valor da posicao %d do vetor: ", i);
                A[i] = lerString.nextLine();
            }
            System.out.print("Os elementos do vetor A sao: ");
            for(int i = 0;i < quantidade;i++){
                System.out.print(A[i] + " ");
            }
        } else {
            System.out.print("Quantidade de elementos invalida");
        }
	
    }
}
