/*Nome: Lucas Felipe da Silva Nunes
Enunciado: */
import java.util.Scanner;
public class Lista1Exercicios10a20 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String exercicio = "";
		do{
			System.out.print("Digite o numero inteiro entre 10 e 20 do exercicio que voce gostaria de ver: ");
			exercicio = ler.nextLine();
			System.out.print(exercicio);
			if(exercicio != "10" && exercicio != "11" && exercicio != "12" && exercicio != "13" && exercicio != "14" && exercicio != "15" && exercicio != "16" && exercicio != "17" && exercicio != "18" && exercicio != "19" && exercicio != "20"){
				System.out.print("Valor invalido. ");
			}
		}while(exercicio != "10" && exercicio != "11" && exercicio != "12" && exercicio != "13" && exercicio != "14" && exercicio != "15" && exercicio != "16" && exercicio != "17" && exercicio != "18" && exercicio != "19" && exercicio != "20");
		switch(exercicio){
			case "10":
				System.out.print("Enunciado: 10 - Qual alternativa possui apenas nomes válidos para arquivos de código fonte Java?\na. Fatec.java e Treinamentos.java.\nb. fatec.java e Treinamentos.Java.\nc. Fatec.JAVA e Treinamentos.java.\nd. FATEC.JAVA e Treinamentos.JAVA.\ne. Fatec.Java e Treinamentos.Java.");
				System.out.print("Resposta: a. Fatec.java e Treinamentos.java."); 
			break;
			case "11":
			
			break;
			case "12":
			
			break;
			case "13":
			
			break;
			case "14":
			
			break;
			case "15":
			
			break;
			case "16":
			
			break;
			case "17":
			
			break;
			case "18":
			
			break;
			case "19":
			
			break;
			default:
			
			break;
		}
	}
}

