/*Nome: Lucas Felipe da Silva Nunes
Enunciado:  Escreva um programa em Java que imprima sequência 3:
1, 1 2 3 4 5 6 7 8 9 10
2, 1 2 3 4 5 6 7 8 9
3, 1 2 3 4 5 6 7 8
4, 1 2 3 4 5 6 7
5, 1 2 3 4 5 6
6, 1 2 3 4 5
7, 1 2 3 4
8, 1 2 3
9, 1 2
10, 1*/
public class Lista6Exercicio27{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n%d,", i);
			for(int j = 1;j <= 11 - i;j++){
				System.out.printf(" %d", j);
			}
		}
	}
}
