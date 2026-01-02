package assignment6;

public class Program14_Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 569;
		int sum = 0;
		
		while (num>0)
		{
			int lastdig = num%10;//9
			sum = sum + lastdig;//0+9
			num = num/10;//56

		}
		System.out.println(sum);
	}

}
