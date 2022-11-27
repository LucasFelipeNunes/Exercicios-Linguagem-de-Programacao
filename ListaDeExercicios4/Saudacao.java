/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a
mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11],
Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
fazendo todas as validações necessárias.*/
import java.util.Scanner;
public class Saudacao {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		int hora = 0;
		do
		{
			System.out.printf("Digite a hora do dia (ou digite 24 para gerar uma aleatoria): ");
			hora = myObj.nextInt();
			if(hora == 24)
			{
				hora = (int)(Math.random() * 24D);
			}
			else if(hora < 0 || hora > 24)
			{
				System.out.printf("Valor invalido. ");
			}
		} while(hora < 0 || hora > 24);
		if(hora >= 0 && hora <= 6)
		{
			System.out.println("Zzzzz");
		}
		else if(hora >= 7 && hora <= 11)
		{
			System.out.println("Bom dia");
		}
		else if(hora >= 12 && hora <= 17)
		{
			System.out.println("Boa tarde");
		}
		else{
			System.out.println("Boa noite");
		}
	}
}
