import java.util.*;

public class Study2 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n;
		double total;
		
		System.out.println("Write a number");
		n = input.nextDouble();
		
		total = 5 + 6 + 7 + 8 + n;
		
		System.out.println("The total of 5+6+7+8+ your number is " + total);
	}

}
