package controle;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println(" Digite o primeiro parametro: ");
		int parametroUm = scanner.nextInt();
		System.out.println(" Digite o segundo parametro: ");
		int parametroDois = scanner.nextInt();
		try { 
			contar(parametroUm,parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	
		}
	
	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
		if(parametro1 >= parametro2) 
			 throw new ParametrosInvalidosException();
		
		int contagem  = parametro2 - parametro1;
		
		for( int i = 1; i <= contagem; i++)
			System.out.println(i);
		
	}
		
}