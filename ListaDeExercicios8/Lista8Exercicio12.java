import java.util.Scanner;

public class Lista8Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] P = new int[10];
        int[] Q = new int[15];


        for(int i = 0;i < 10;i++){
            System.out.printf("Digite o valor da posicao %d do vetor P: ", i);
            P[i] = ler.nextInt();
        }

        for(int i = 0;i < 15;i++){
            System.out.printf("Digite o valor da posicao %d do vetor Q: ", i);
            Q[i] = ler.nextInt();
        }

        int[] R = new int[25];

        for(int i = 0;i < 10;i++){
            R[i] = P[i];
        }

        for(int i = 0;i < 15;i++){
            R[i+10] = Q[i];
        }

        for(int i = 0;i < 25;i++){
            System.out.print(R[i]);
        }
    }
}
