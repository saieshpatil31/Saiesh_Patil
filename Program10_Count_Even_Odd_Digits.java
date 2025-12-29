package assignments;

public class Program10_Count_Even_Odd_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9661364;
		int evecount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int lastdigit=num%10;
			
			if(lastdigit%2==0)
				evecount++;
			else
				oddcount++;
			num=num/10;
		}
			System.out.println("Even : "+evecount);
			System.out.println("Odd : "+oddcount);
	}

}
