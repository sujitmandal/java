/*Sum of all three digit Prime Number */
import java.util.Scanner;
/*
This program created by Sujit Mandal 
*/

public class PrimeNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
        int i, number, result, sum=0;
		
		for(number = 101; number <= 999; number++){
			result = 0;
			for(i = 101; i <= number/2; i++){
				if(number%i == 0){
					result++;
					break;
				}
			}
			if(result == 0 && number != 1){
				sum= sum + number;
			}
		}
		System.out.printf("Sum of all three digit Prime Number is: %d ",sum);

	}

}
