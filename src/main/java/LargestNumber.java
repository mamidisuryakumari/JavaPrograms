import java.util.ArrayList;
import java.util.Scanner;


public class LargestNumber {

//	Scanner scanner = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	int large = 0;
	
	public void largestNumber() {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("How many numbers do you want");
	int totalNumberOfDigits =	scanner.nextInt();
	System.out.println("Please enter "+totalNumberOfDigits+" numbers");
	for(int i=1;i<=totalNumberOfDigits;i++) {
		list.add(scanner.nextInt());
	
	}
	System.out.println("Numbers in list" + list);
//	find largest number in the list
	 for (Integer number : list) {
		if(number > large)
		{
			large = number;
		}
	}
	
	 System.out.println("Large number in the list is :"+large);
	}
	
	public static void main(String args[]) {
		
		LargestNumber largest_Number = new LargestNumber();
		largest_Number.largestNumber();
		
	}
}
