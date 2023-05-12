import java.util.Scanner;

class AgeInvalid extends Exception
{
	public AgeInvalid (String str)
	{
		super (str);
	}
}
class Exception4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Age");
		int age = sobj.nextInt();

		try
		{
			if(age < 18)
			{
				throw new AgeInvalid("Age is less than 18");
			}
		}
		catch(AgeInvalid obj)
		{
			System.out.println("Exception occured");
		}
	}
	
}