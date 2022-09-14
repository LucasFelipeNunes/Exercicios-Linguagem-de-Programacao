/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que imprima sequência 4:
1, 2 3 4 5 6 7 8 9 10
2, 3 4 5 6 7 8 9 10
3, 4 5 6 7 8 9 10
4, 5 6 7 8 9 10
5, 6 7 8 9 10
6, 7 8 9 10
7, 8 9 10
8, 9 10
9, 10
10,*/
public class Lista6Exercicio28{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n%d,", i);
			for(int j = i + 1;j <= 10;j++){
				System.out.printf(" %d", j);
			}
		}
	}
}
