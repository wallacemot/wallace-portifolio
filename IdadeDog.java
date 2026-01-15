import java.util.Scanner;

public class IdadeDog{
	public static void main(String[]args){
		
		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(java.util.Locale.US);
		
		System.out.println("Bem-vindo ao calculadora de idade do seu Pet");
		
		System.out.println("Informe seu nome:");
		
		String nomeDono = leitor.nextLine();
		
		System.out.println("Diga qual o nome do seu pet");
		
		String nomePet = leitor.nextLine();
		
		System.out.println("Qual a idade do seu Pet");
		
		double idadePet = leitor.nextDouble();
		
		leitor.nextLine();
		
		double calculadoraIdadePet = idadePet*7;
		
		System.out.println( nomeDono + ", A idade do" + nomePet + " é de" + calculadoraIdadePet + "em idade humana");
		
		if (calculadoraIdadePet >= 60){
			System.out.println( "ele está idoso, cuide da saude do seu pet");
		}
		else if(calculadoraIdadePet < 7){
				System.out.println( " ele é um filhote");
		}
		else{
				System.out.println( " ele é novo, está cheio de energia, aproveite");
		}
		
		leitor.close();

	}
}