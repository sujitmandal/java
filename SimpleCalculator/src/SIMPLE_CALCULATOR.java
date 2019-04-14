import java.util.Scanner;
import java.math.*;
public class SIMPLE_CALCULATOR {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int operation;
		float a, b, sum=0, sub=0, mult=0, divi=0;
		double exp=0;
		
		do {
			System.out.println("SIMPLE CALCULATOR");
			System.out.println("SELECT ANAY OPERATION BAY ENTERING THE COROSPONDIN NUMBER");
			System.out.println("1: ADDITION");
			System.out.println("2: SUBSTRACTION");
			System.out.println("3: MULTIPLICATION");
			System.out.println("4: DIVITION");
			System.out.println("5: EXPONENT/POWER");
			System.out.println("6: EXIT");
			
			
			
			System.out.println( "ENTER THE OPARATION : " );
			operation = input.nextInt();
			
			if(operation == 1) {
				System.out.println("YOU HAVE SELECT ADDITION.");
			}
			else if(operation == 2) {
				System.out.println("YOU HAVE SELECT SUBSTRACTION." );
			}
			else if(operation == 3) {
				System.out.println("YOU HAVE SELECT MULTIPLICATION." );
			}
			else if(operation == 4) {
			System.out.println("YOU HAVE SELECT DIVITION.");
			}
			else if(operation == 5) {
				System.out.println("YOU HAVE SELECT EXPONENT/POWER.");
			}
			
			
			switch(operation) {
				case 1:
					if(operation < 5) {
						System.out.println("ENTER THE FIRST VELUE : ");
								a  = input.nextFloat();
						System.out.println("ENTER THE SECOND VELUE : " );
							b = input.nextFloat();
					sum = (a +b);
					System.out.println("THE SUM IS : " + a  + "+"  + b + " = " + sum);
					break;
					}
					
				case 2:
					if(operation < 5) {
						System.out.println("ENTER THE FIRST VELUE : ");
								a  = input.nextFloat();	
						System.out.println("ENTER THE SECOND VELUE : " );
							b = input.nextFloat();
					sub = (a-b);
					System.out.println("THE SUBSTRACTION IS : " + a  + "-" + b + " = " + sub);
					break;
					}
					
				case 3:
					if(operation < 5) {
						System.out.println("ENTER THE FIRST VELUE : ");
								a  = input.nextFloat();						
						System.out.println("ENTER THE SECOND VELUE : " );
							b = input.nextFloat();
					mult = (a*b);
					System.out.println("THE  MULTIPLICATION IS : " + a  + "*" + b + " = " + mult);
					break;
					}
					
				case 4:
					if(operation < 5) {
						System.out.println("ENTER THE FIRST VELUE : ");
							a  = input.nextFloat();						
						System.out.println("ENTER THE SECOND VELUE : " );
							b = input.nextFloat();
					divi = (a/b);
					System.out.println("THE  DIVITION IS : " + a  + "/" + b + " = " + divi);
					break;
					}
					
				case 5:
					if(operation == 5) {
						System.out.println("ENTER THE BASE VALE : ");
						double	x = input.nextDouble();
						System.out.println("ENTRE THE EXPONENT VALUE : ");
						double	y = input.nextDouble();
						exp = Math.pow(x,y);
						System.out.println("THE VALUE IS : " + x + "^" + y + " = " + exp);
						break;
					}
				case 6: 
				    System.exit(0);
					break;
				default :
					System.out.println("INVALID INPUT.");
					break;
			}
			System.out.println("-----------------------------------------------");
		}while(operation !=6 );

	}

}
