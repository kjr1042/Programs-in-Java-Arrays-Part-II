import java.util.Scanner;

public class indexOfMaximumElementInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max)
			{
				index =i;
			}
		}
		System.out.println(index);

	}

}
