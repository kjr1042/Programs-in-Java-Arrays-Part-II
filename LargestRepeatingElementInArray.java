import java.util.Scanner;

public class LargestRepeatingElementInArray {

	public static void main(String[] args) {
		Scanner  scan  =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n]; 
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int largestRepeating =Integer.MIN_VALUE;
		boolean elementFound=false;
		for(int i=0;i<a.length;i++)
		{
			boolean isRepeat =false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					isRepeat =true;
					elementFound=true;
					break;
				}
			}
			if(isRepeat && a[i]>largestRepeating)
			{
				largestRepeating=a[i];
			}
		}
		if(!elementFound)
		{
			largestRepeating=-1;
		}
		System.out.println(largestRepeating);
	}

}
