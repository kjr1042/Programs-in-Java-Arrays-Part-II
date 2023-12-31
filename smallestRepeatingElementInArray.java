import java.util.Scanner;

public class smallestRepeatingElementInArray {
	static void findSmallestRepeating(int[] a)
	{
		int smallestRepeating=Integer.MAX_VALUE;
		boolean isRepeatElementFound=false;
		for(int i=0;i<a.length;i++)
		{
			boolean isRepeat =false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					isRepeat =true;
					isRepeatElementFound=true;
					break;
				}
			}
			if(isRepeat && a[i]<smallestRepeating)
			{
				smallestRepeating =a[i];
			}
			
		 }
		if(!isRepeatElementFound)
		{
			smallestRepeating =-1;
		}
		System.out.println(smallestRepeating);
	}

	public static void main(String[] args) {
		Scanner  scan  =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n]; 
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		findSmallestRepeating(a);
	}

}


















