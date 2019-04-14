import java.util.Scanner;
public class Total_Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		int i;
		float total_sales = 0;
		
		System.out.println("Enter the number of items:");
		int n = input.nextInt();
		
		float total_items_coat[] = new float[n];
		int total_items_sold[] = new int[n];
		
		System.out.printf("Enter %d items cost:\n",n);
		for(i=0; i<n; i++)
			total_items_coat[i] = input.nextFloat();
		
		System.out.printf("Enter %d items sold:\n", n);
		for(i=0; i<n; i++)
			total_items_sold[i] = input.nextInt();
		
		for(i=0; i<n; i++) {
			for(i=0; i<n; i++) {
				total_sales = total_sales + total_items_coat[i] * total_items_sold[i];
			}
		}
		System.out.println("-----------------------------");
		System.out.printf("The total sales is : %.2f/-\n",total_sales);
		System.out.println("-----------------------------");
	}

}
