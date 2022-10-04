//Nome: Lucas Felipe da Silva Nunes
import java.util.Random;
public class ExibeNumeroAleatorio
{
	public static void main (String[] args)
	{
		Random aleatorio = new Random();
		double numeroAleatorio = aleatorio.nextInt(100);
		System.out.println(numeroAleatorio);
	}
}
