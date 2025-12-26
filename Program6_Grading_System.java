package assignments;

public class Program6_Grading_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks = 82.56f;
		if (marks<=100)
		{
			if (marks>=90)
			{
				System.out.println("Grade is A");
			}
			else if (marks>=75)
			{
				System.out.println("Grade is B");
			}
			else if (marks>=50)
			{
				System.out.println("Grade is C");
			}
			else
			{
				System.out.println("Fail");
			}
		}
	}

}
