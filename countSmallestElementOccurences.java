import java.util.Scanner;

public class countSmallestElementOccurences {

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
		System.out.println("min : " +min);
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==min)
			{
				count++;
			}
		}
		System.out.println("count: " +count);

	}

}
