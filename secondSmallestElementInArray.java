import java.util.Scanner;

public class secondSmallestElementInArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int arr[] = new int[num]; 
        int n = arr.length; 
        for(int i=0;i<n;i++)
        {
        	arr[i]=scan.nextInt();
        }
        int smallest = Integer.MAX_VALUE; 
        // traversing the array to find 
        // smallest element. 
        for (int i = 0; i < n; i++) { 
            if (arr[i] < smallest) { 
                smallest = arr[i]; 
            } 
        } 
        System.out.println("smallest element is: "
                           + smallest); 
        int second_smallest = Integer.MAX_VALUE; 
        
        // traversing the array to find second smallest 
        // element 
        for (int i = 0; i < n; i++) { 
            if (arr[i] < second_smallest 
                && arr[i] > smallest) { 
                second_smallest = arr[i]; 
            } 
        } 
        System.out.println("second smallest element is: "
                           + second_smallest); 

	}

}
