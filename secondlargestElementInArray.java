import java.util.Scanner;

public class secondlargestElementInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max1=a[i];
			}
			
			
		}
		System.out.println("max1 : "+max1);
		int max2 =Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2 && a[i]<max1)
			{
				max2 =a[i];
			}
		}
		System.out.println("max2 : "+max2);
	}

}
