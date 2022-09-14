/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que imprima sequência 5:
1, 1 3 5 7 9
2, 2 4 6 8 10
3, 1 3 5 7 9
4, 2 4 6 8 10
5, 1 3 5 7 9
6, 2 4 6 8 10
7, 1 3 5 7 9
8, 2 4 6 8 10
9, 1 3 5 7 9
10, 2 4 6 8 10*/
public class Lista6Exercicio29{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n%d,", i);
			if(i%2 == 0){
				System.out.printf(" 2 4 6 8 10");
			}
			else{
				System.out.printf(" 1 3 5 7 9");
			}
		}
	}
}
