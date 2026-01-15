import java.util.Scanner;

public class IdadeDog{
	public static void main(String[]args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao calculadora de idade do seu Pet");
		
		System.out.println("Informe seu nome:");
		
		String nomeDono = leitor.nextLine();
		
		System.out.println("Diga qual o nome do seu pet");
		
		String nomePet = leitor.nextLine();
		
		System.out.println("Qual a idade do seu Pet");
		
		int idadePet = leitor.nextInt();
		
		leitor.nextLine();
		
		int calculadoraIdadePet = idadePet*7;
		
		System.out.println( nomeDono + ", A idade do" + nomePet + " é de" + calculadoraIdadePet + "em idade humana");
		
		leitor.close();
	}
	



}