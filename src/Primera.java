import java.util.Scanner;

public class Primera {
	
	public static void main (String args[]) {

		Scanner entrada = new Scanner(System.in);
		
		
		long number_in = entrada.nextInt();
		long result = factorial(number_in);
		
		 
	
		System.out.println(result);
		
	}
	
	public static long factorial(long number) {
		if (number <= 1)return 1;
		return number * factorial(number - 1);
	}

}