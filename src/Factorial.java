
public class Factorial {
	public static int fact(int n) {
		int num=1;
		for(int i=1;i<=n;i++)
			num*=i;
		return num;
	}

	public static void main(String[] args) {
		System.out.println(fact(3));
	}
}
