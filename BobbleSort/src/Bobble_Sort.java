import java.util.Scanner;
public class Bobble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  i, j, swap;
		    Scanner input = new Scanner(System.in);
		 
		    System.out.println("Enter number of elements:");
		    int n = input.nextInt();
		 
		    int data[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers:");
		 
		    for (i = 0; i < n; i++)
		   	 data[i]  = input.nextInt();
		   
		    for (i = 0; i < ( n - 1 ); i++) {
		      for (j = 0; j < n - i - 1; j++) {
		        if (data[j] > data[j+1]) /* For descending order use < */
		        {
		          swap       = data[j];
		          data[j]   = data[j+1];
		          data[j+1] = swap;
		        }
		      }
		    }
		 
		    System.out.println("\nSorted list of numbers:");
		 
		    for (i = 0; i < n; i++)
		      System.out.println(data[i]);

	}

}
