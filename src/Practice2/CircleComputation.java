package Practice2;
import java.util.*;
import java.text.DecimalFormat;

public class CircleComputation {
	
	public static String Area(double r) {
		DecimalFormat f = new DecimalFormat("##.00");
		double area;
		area=Math.PI*r*r;
		return f.format(area);
	}
	
	public static String Circumference(double r) {
		DecimalFormat f = new DecimalFormat("##.00");
		double circum;
		circum=Math.PI*2*r;
		return f.format(circum);
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		double radius;
		System.out.print("Enter the radius: ");
		radius=scan.nextInt();
		System.out.println("The Area of circle is: "+Area(radius));
		System.out.println("The Circumference of circle is: "+Circumference(radius));
		scan.close();
	}
}
