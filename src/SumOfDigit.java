import java.util.*;
public class SumOfDigit {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int sum=0,r;
		while(n>=10)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		sum+=n;
		System.out.println(sum);
		scan.close();
	}

}
