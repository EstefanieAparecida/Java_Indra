import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd1, qtd2, cod1, cod2;
		double vlr1, vlr2, total;
		
		qtd1 = sc.nextInt();
		cod1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		
		qtd2 = sc.nextInt();
		cod2 = sc.nextInt();
		vlr2 = sc.nextDouble();
		
		total = vlr1 * qtd1 + vlr2 * qtd2;
		
		 System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
