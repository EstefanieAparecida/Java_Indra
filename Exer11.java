import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial;
		int horaFinal ;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();

	}

}
