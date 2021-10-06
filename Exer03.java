import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double b ,A , pi = 3.14159;
		
		b = sc.nextDouble();
		A = pi * b * b;
		
		System.out.printf("A= %.4f%n", A);
		
		sc.close();
		
	}

}
