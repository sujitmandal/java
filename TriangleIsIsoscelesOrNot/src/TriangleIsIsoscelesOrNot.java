import java.util.Scanner;

public class TriangleIsIsoscelesOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
			
			int side;
			float side_a, side_b, side_c;
			
			System.out.println("Enter the number of side: ");
			side = input.nextInt();
			
			if(side == 3) {
				
				System.out.println("Enter the first side: ");
				side_a = input.nextFloat();
				
				System.out.println("Enter the first side: ");
				side_b = input.nextFloat();
				
				System.out.println("Enter the first side: ");
				side_c = input.nextFloat();
				
				if((side_a == side_b) || (side_a == side_c) || (side_b == side_c))
					
					System.out.println("\nit is a isoscales");
				else
					System.out.println("\nit's  not isoscalise");
			}
			else
				System.out.println("\nit's not a traingale");

	}

}
