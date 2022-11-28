import java.util.Scanner;

public class Lista8Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = ler.nextInt();

        if(quantidade <= 15 && quantidade >= 1){
            int[] A = new int[quantidade];
            int[] B = new int[quantidade];
            String iguais = "";


            for(int i = 0;i < quantidade;i++){
                System.out.printf("Digite o valor da posicao %d do vetor A: ", i);
                A[i] = ler.nextInt();
            }

            for(int i = 0;i < quantidade;i++){
                System.out.printf("Digite o valor da posicao %d do vetor B: ", i);
                B[i] = ler.nextInt();
            }

            System.out.print("Os elementos do vetor A sao: ");
            for(int i = 0;i < quantidade;i++){
                System.out.print(A[i] + " ");
            }

            System.out.print("Os elementos do vetor B sao: ");
            for(int i = 0;i < quantidade;i++){
                System.out.print(B[i] + " ");
            }

            for(int i = 0;i < quantidade;i++){
                if(A[i] == B[i]){
                    iguais  += "" + i + " ";
                } 
            }

            System.out.println("Iguais nas posicoes: " + iguais);

        } else {
            System.out.print("Quantidade de elementos invalida");
        }
    }
}
