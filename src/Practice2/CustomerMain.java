package Practice2;

class Customer {
	public Customer(int custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	private int custId;
	private String custName;
	void print() {
		System.out.println(custId);
		System.out.println(custName);
	}
}

public class CustomerMain{
	public static void main(String[] args) {
		Customer obj1=new Customer(12,"abc");
		obj1.print();
	}
}

