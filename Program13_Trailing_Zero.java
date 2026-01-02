package assignment6;

public class Program13_Trailing_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int ognum=num;
		int count = 0;
		int result =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		if (count==1)
		{
			result = ognum*10;
		}
		else if (count==2)
		{
			result = ognum*100;
		}
		else
		{
			result = ognum;
		}
		System.out.println(result);
	}

}
