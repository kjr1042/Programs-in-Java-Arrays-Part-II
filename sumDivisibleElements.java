import java.util.Scanner;

public class sumDivisibleElements {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		// check array elements divisible by 3 and 5 and print their sum.
//		n=5
//		input : 15 30 35 40 45
//		sum : 90
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0 && a[i]%5==0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("sum : " +sum);
		
		

	}

}
