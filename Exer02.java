import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, Resultado;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		Resultado = n1 + n2;
		
		System.out.println("O resultado da soma é: " + Resultado);
		
		sc.close();
		

	}

}
