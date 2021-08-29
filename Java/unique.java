import java.util.*;

	class unique

	{

	public static void main(String args[] )

	{

	Scanner sc=new Scanner(System.in);

	System.out.print("Enter a number :=  ");

	int n,i,digit,div,f;
	
	n=sc.nextInt();
	
	for(i=0;i<=9;i++)
	{
		f=0;
		for(div=n;div>0;div/=10)
		{
			digit = div%10;
			if(digit == i)
				f++;
		}
		if(f>1)
		{
			System.out.println("Not Unique");
			break;
		}
	}
	if(i == 10)
	{
		System.out.println("It is Unique");
	}
	}
	
	}
