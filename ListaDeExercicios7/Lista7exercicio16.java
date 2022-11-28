import java.util.Scanner;

public class Lista7exercicio16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase = ler.nextLine();
        int quantidade = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 'A'  && frase.charAt(i) <= 'Z'){
                quantidade++;
            }
        }

        if(quantidade == frase.length()){
            System.out.println("Todas maiúsculas");
        } else  {
            System.out.println("Contém minúsculas");
        } 

       
    }
}
