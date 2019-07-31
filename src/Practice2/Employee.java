package Practice2;

class Employer {
	public Employer(int empCode, int hoursWorked, int wagePerHour) {
		this.empCode = empCode;
		this.hoursWorked = hoursWorked;
		this.wagePerHour = wagePerHour;
	}
	int empCode;
	int hoursWorked;
	int wagePerHour;
	
}

class WageCalc extends Employer {
	private int wph;
	private int hours;
	public WageCalc(int a, int b, int c) {
		super (a,b,c);
		this.wph=b;
		this.hours=c;
	}
	void print() {
		System.out.println(wph*hours);
	}
}

public class Employee{
	public static void main(String[] args) {
		WageCalc obj1=new WageCalc(10,20,30);
		obj1.print();
	}
}
