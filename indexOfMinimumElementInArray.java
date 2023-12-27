import java.util.Scanner;

public class indexOfMinimumElementInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==min)
			{
				index =i;
			}
		}
		System.out.println(index);

	}

}
