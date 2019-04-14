public class PrimeNumber {
	
	/*
		This program created by Sujit Mandal 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, number, result;
		
		System.out.println("Prime Number from 1 to 100 are:");
		
		for(number = 1; number <= 100; number++)
		{
			result = 0;
			for(i = 2; i <= number/2; i++)
			{
				if(number%i == 0)
				{
					result++;
					break;
				}
			}
			if(result == 0 && number != 1)
			{
				System.out.printf("%d ",number);	
			}
		}
	}
}

