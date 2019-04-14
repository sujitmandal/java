import java.util.Scanner;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter number of elements:");
	    int n = input.nextInt();
	 
	    int data[] = new int[n];
	 
	    System.out.println("Enter " + n + " integers:");
	 
	    for (i = 0; i < n; i++)
	   	 data[i]  = input.nextInt();
	   
	    System.out.println("Enter a number to search:");
	    int search = input.nextInt();
	    
	    for (i = 0; i < n; i++) {
	    	if(data[i] == search) {     //If required element is found 
	    		System.out.printf("\n%d is present at location %d.\n", search, i+1);
	    		break;
	    	}
	    }
	    if(i == n)
	    	System.out.printf("\n%d isn't present in the array.\n", search);

	}

}
