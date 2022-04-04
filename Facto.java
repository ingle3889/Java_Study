import java.util.Scanner;

public class Facto{
	public static void main(String[] args){		
	
		int number = 10 ;
		long Facto = 1 ;


		 Scanner scanner= new Scanner(System.in);

                 System.out.println("Enter the Number : ");

                 number = scanner.nextInt();

	for(int i=1; i<= number; i++){
	
		Facto = Facto * i ;
	
	
		}
	System.out.println("Factorial of " + number + " is: " + Facto);

	  }

   }