package Practice2;
import java.util.*;

class AreaCalc{
	
	static int area(double radius){
		int area = (int)(Math.PI*radius*radius);
		return area;
	}
	static int area(int b, int h) {
		int area = b*h/2;
		return area;
	}
	static int area(double r,double h) {
		int area= (int)(Math.PI*2*r*(h+r));
		return area;
	}
}

class User extends AreaCalc{
	private int area;
	int areaFunc() {
		Scanner scan=new Scanner(System.in);
		int choice;
		choice = scan.nextInt();
		area = AreaCalc.area(choice,choice);
		scan.close();
		return area;
		
	}
	void print() {
		System.out.println(area);
	}
}

public class AreaOverload {
	public static void main(String[] args) {
		User myobj = new User();
		myobj.print();
	}
}
