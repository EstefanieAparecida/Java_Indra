import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.println("informe um numero: ");
		N = sc.nextInt();
		
		if (N < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
		
		sc.close();
	}
		
}
