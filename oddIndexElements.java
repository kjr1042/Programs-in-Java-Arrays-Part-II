import java.util.Scanner;

public class oddIndexElements {

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
			if(i%2!=0)
			{
				System.out.println(a[i] +" ");
			}
		}

	}

}
