/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que imprima sequência 2:
1, 1
2, 1 2
3, 1 2 3
4, 1 2 3 4
5, 1 2 3 4 5
6, 1 2 3 4 5 6
7, 1 2 3 4 5 6 7
8, 1 2 3 4 5 6 7 8
9, 1 2 3 4 5 6 7 8 9
10, 1 2 3 4 5 6 7 8 9 10*/
public class Lista6Exercicio26{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n%d,", i);
			for(int j = 1;j <= i;j++){
				System.out.printf(" %d", j);
			}
		}
	}
}
