import java.util.Scanner;

public class maxPairSumInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n]; 
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		// for firstLargest and secondLargest
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max1 =a[i];
			}
		}
        System.out.println(max1);
        for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2  )
			{
				max2 =a[i];
			}
		}
        System.out.println(max2);
        int p1=max1*max2;
        //System.out.println(p1);
        // for firstSmallest and secondSmallest
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min1 =a[i];
			}
		}
        System.out.println(min1);
        for(int i=0;i<a.length;i++)
		{
			if(a[i]<min2  )
			{
				min2 =a[i];
			}
		}
        
        System.out.println(min2);
        int p2 =min1*min2;
        //System.out.println(p2);
        System.out.println((p1>p2)?p1:p2);
	}
	

}
