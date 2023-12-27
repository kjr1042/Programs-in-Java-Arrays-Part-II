import java.util.Scanner;

public class evenOddNegativeElementsInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0 && a[i]>0)
			{
				System.out.print(a[i] +" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0 && a[i]>0)
			{
				System.out.print(a[i] +" ");
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i] +" ");
			}
		}
		
		

	}

}
