import java.util.Scanner;
public class SwitchTeste{
	public static void main(String[]args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("informe um dia da semana");
	
	int diaDaSemana = scanner.nextInt();
	
	String nomeDoDiaDaSemanada = "";
	
	switch(diaDaSemana){
		case 1: nomeDoDiaDaSemanada = "domingo";
			break;
		case 2: nomeDoDiaDaSemanada = "segunda-feira";
			break;
		case 3: nomeDoDiaDaSemanada = "terça-feira";
			break;
		case 4: nomeDoDiaDaSemanada = "quarta -feira";
			break;
		case 5: nomeDoDiaDaSemanada = "quinta-feira";
			break;
		case 6: nomeDoDiaDaSemanada = "sexta-feira";
			break;
		case 7: nomeDoDiaDaSemanada = "sabado";
			break;
		
		default: nomeDoDiaDaSemanada = "[não encontrado!]";
	
			}
		System.out.println ("o dia da semana é " + nomeDoDiaDaSemanada + ".");
	
		System.out.println ("fim");
	
		scanner.close();
	}

}