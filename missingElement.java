import java.util.Scanner;

public class missingElement {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] =scan.nextInt();
		}
		int sum =(n+1)*(n+2)/2;
		for(int i=0;i<a.length;i++)
		{
			sum =sum-a[i];
		}
		System.out.println(sum);

	}

}
