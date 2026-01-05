package assignment6_v2;

public class Program16_Prime_Number_Check {
	
	static void isPrime(int num)
	{
		if (num==1)
			System.out.println("Neither prime nor composite");
		else if (num==2)
			System.out.println("Even prime number");
		else if (num%2==0)
			System.out.println("Not a prime");
		else
		{
			boolean flag = true;
			// for odd number check
			for (int fact=3;fact<num;fact=fact+2)//
			{
				if(num%fact==0)
				{
					flag = false;
					System.out.println("Not a prime");
					break;
				}
			}
			if(flag==true)
			System.out.println("Is Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(31);
	}

}
