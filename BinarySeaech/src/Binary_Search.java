import java.util.Scanner;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, first, last, middle;
		 Scanner input = new Scanner(System.in);
		 
		    System.out.println("Enter number of elements:");
		    int n = input.nextInt();
		 
		    int data[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers:");
		 
		    for (i = 0; i < n; i++)
		   	 data[i]  = input.nextInt();
		   
		    System.out.println("Enter a number to search:");
		    int search = input.nextInt();
		    
		    first = 0;
		    last = n-1;
		    middle = (first + last)/2;
		    
		    while(first <= last) {
		    	if(data[middle] < search)
		    		first = middle +1;
		    	else if (data[middle] == search) {
		    		System.out.printf("%d found at location %d.\n", search, middle+1);
		    		break;
		    	}
		    	else
		    		last = middle - 1;
		    	    middle = (first + last)/2;
		        }
		    	if(first > last)
		    		System.out.printf("Not found! %d isn't present in the list.\n", search);

	}

}
