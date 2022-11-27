import java.util.Scanner;
public class Lista8Exercicio30{
	public static void main(String[] args){
		double auxiliar = 0, dimensao = 0;
		Scanner ler = new Scanner(System.in);
		do{
			System.out.print("Digite a dimensao do vetor:\t");
			dimensao = ler.nextDouble();
			if(dimensao <= 0 && (dimensao * 10) % 10 != 0){
				System.out.print("Valor invalido. ");
			}
		}while(dimensao <= 0 && (dimensao * 10) % 10 != 0);
		double[] AK = new double[(int) dimensao], AL = new double[(int) dimensao * 2 - 1];
		for(int i = 0;i < dimensao;i++){
			System.out.print("Digite o elemento da posicao " + (i + 1) + " do vetor:\t");
			AK[i] = ler.nextDouble();
			for(int j = 0;j < i;j++){
				if(AK[i] < AK[j]){
					auxiliar = AK[i];
					AK[i] = AK[j];
					AK[j] = auxiliar;
				}
			}
		}
		System.out.print("Vetor AL:\t");
		auxiliar = 0;
		for(int i = 0;i < dimensao * 2 - 1;i++){
			if(i % 2 == 1){
				AL[i] = (AK[(int) auxiliar] + AK[(int) auxiliar + 1]) / 2;
				++auxiliar;
			}
			else{
				AL[i] = AK[i / 2];
			}
			System.out.print(" " + AL[i]);
		}
	}
}
