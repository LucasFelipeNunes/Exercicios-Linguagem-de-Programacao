/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que imprima sequência 6:
1, 1
2, 2 4
3, 1 3 5
4, 2 4 6 8
5, 1 3 5 7 9
6, 2 4 6 8 10 12
7, 1 3 5 7 9 11 13
8, 2 4 6 8 10 12 14 16
9, 1 3 5 7 9 11 13 15 17
10, 2 4 6 8 10 12 14 16 18 20*/
public class Lista6Exercicio30{
	public static void main (String args[]){
		for(int i = 1;i < 11;i++){
			System.out.printf("\n%d,", i);
			if(i%2 == 0){
				for(int j = 2;j <= i * 2;j += 2){
					System.out.printf(" %d", j);	
				}
			}
			else{
				for(int j = 1;j <= i * 2;j += 2){
					System.out.printf(" %d", j);	
				}
			}
		}
	}
}
