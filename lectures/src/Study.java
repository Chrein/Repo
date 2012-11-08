import java.util.*;

public class Study {

	public static void main(String[] args) {
		
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		
		area = radius * radius * Math.PI;
		
		System.out.println("The area is " + area);

		
	}

}
