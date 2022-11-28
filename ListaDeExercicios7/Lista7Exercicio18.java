import java.util.Scanner;

public class Lista7Exercicio18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma sequecia de bits: ");
        String bits = ler.nextLine();
        int quantidade = 0;
        for (int i = 0; i < bits.length(); i++) {
            if(bits.charAt(i) == '0' || bits.charAt(i) == '1'){
                quantidade++;
            }
        }

        if(quantidade == 8 && bits.length() == 8){
            System.out.println("Sequencia de bits");
        } else  {
            System.out.println("Sequencia invalida");
        } 

       
    }
}
