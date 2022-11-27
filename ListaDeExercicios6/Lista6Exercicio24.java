/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10.*/
public class Lista6Exercicio24{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n\nTABUADA DO %d", i);
			for(int j = 0;j < 11;j++){
				System.out.printf("\n%d * %d = %d", i, j, i * j);
			}
		}
	}
}
			
