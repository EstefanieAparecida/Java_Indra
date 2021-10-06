import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double a;
		
		a = sc.nextDouble();
		System.out.println("Você digitou: " + a);
		
		char b;
		
		b = sc.next().charAt(0);
		System.out.println("Você digitou: " + b);
		
		String c;
		int d;
		double e;
		
		c = sc.next();
		d = sc.nextInt();
		e = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		sc.close();

	}

}
