import java.util.Scanner;

public class lastOccurenceIndexFinder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		char c =scan.nextLine().charAt(0);
		int index =0;
		for(int i=0;i<str.length();i++)
		{
			char currentChar = str.charAt(i);
			//System.out.println(currentChar);
			if(currentChar==c)
			{
				index =i;
			}
		}
		System.out.println(index);
	}

}
