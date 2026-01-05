package assignment6_v2;

public class Program15_Fibonacii_Series_Using_Methods {
	
	static int printFibonacci(int n)
	{
		int num1 = 0; int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		int i=1;
		while(i<=(n-2))
		{
			int num3 = num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result= printFibonacci(10);
		System.out.print(result);
	}

}
