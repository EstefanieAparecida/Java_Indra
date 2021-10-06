
import java.util.Scanner;

public class TesteScanner2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

		int x;
		String s4, s5, s6;
		x = sc.nextInt();
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
