import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a, b, t; 
	    int gcd, lcm;
		
		System.out.println("Enter first integers:");
		int x = input.nextInt();
		
		System.out.println("Enter second integers:");
		int y = input.nextInt();
		
		a=x;
		b=y;
		
		while(b !=0) {
			t = b;
			b = a % b;
			a = t;
		}
		gcd = a;
		lcm = (x*y)/gcd;
		
		System.out.printf("Greatest common divisor of %d and %d is = %d\n", x, y, gcd);
		System.out.printf("Least common multiple of %d and %d is = %d\n", x, y, lcm);


	}

}
