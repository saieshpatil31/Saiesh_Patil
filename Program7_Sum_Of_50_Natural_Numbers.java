package assignments;

public class Program7_Sum_Of_50_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int sum = 0;
		
		while (n<=50)
		{
			sum=sum+n;
			//System.out.println(n);
			n=n+1;
		}
		System.out.println("Sum of first 50 natural number is "+ sum);
	}

}
// Output is 1275 but getting as 1276
