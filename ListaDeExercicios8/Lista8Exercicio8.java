import java.util.Scanner;

public class Lista8Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        int[] A = new int[5];
        
        int soma = 0;

        for(int i = 0;i < 5;i++){
            System.out.printf("Digite o valor da posicao %d do vetor A: ", i);
            A[i] = ler.nextInt();

            if(A[i] % 2 != 0){
                soma += A[i];
            }
        }
        if(soma != 0){
            System.out.println("Soma dos numeros impares: " + soma);
        } else {
            System.out.println("Nenhum numero impar");
        }
        
    }
}
