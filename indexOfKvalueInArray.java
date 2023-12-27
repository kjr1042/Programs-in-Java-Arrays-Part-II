import java.util.Scanner;

public class indexOfKvalueInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int k=scan.nextInt();
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				index =i;
			}
		}
		System.out.println(index);

	}

}
