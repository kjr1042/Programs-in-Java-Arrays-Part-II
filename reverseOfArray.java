import java.util.Scanner;

public class reverseOfArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] +" ");	
		}
	}

}
