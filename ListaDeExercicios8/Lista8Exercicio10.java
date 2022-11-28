import java.util.Scanner;

public class Lista8Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] PA = new int[5];
        int[] PB = new int[5];


        for(int i = 0;i < 5;i++){
            System.out.printf("Digite o valor da posicao %d do vetor PA: ", i);
            PA[i] = ler.nextInt();
        }

        for(int i = 0;i < 5;i++){
            System.out.printf("Digite o valor da posicao %d do vetor PB: ", i);
            PB[i] = ler.nextInt();
        }

        int[] PC = new int[10];

        for(int i = 0;i < 5;i++){
            PC[i] = PA[i];
            PC[i+5] = PB[i];
        }

        for(int i = 0;i < 10;i++){
            System.out.print(PC[i]);
        }
    }
}
