import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double numero, Vhora, salario, Thora;
		
		numero = sc.nextDouble();
		Vhora = sc.nextDouble();
		Thora = sc.nextDouble();
		
		salario = Vhora * Thora; 
		
		System.out.println("Number: " + numero );
		System.out.println("Salary: " + salario);
		
		sc.close();
		
		
		
	}
}
