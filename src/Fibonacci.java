import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,sum=0,c=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;(i<=n)&&(sum<=100);i++)
		{
			if(a%2!=0)
				System.out.println(a);
			sum=sum+a;
			c=a+b;
			a=b;
			b=c;
		}
		scan.close();
	}

}
