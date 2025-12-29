package assignments;

public class Program8_Count_The_Number_Of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45678;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Total count of digit "+count);
	}

}
