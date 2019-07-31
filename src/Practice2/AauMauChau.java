package Practice2;

public class AauMauChau {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=110;i++)
		{
			count++;
			if(i%3==0 || i%5==0 || i%7==0) {
				if(i%3==0)
					System.out.print("Aau");
				if(i%5==0)
					System.out.print("Mau");
				if(i%7==0)
					System.out.print("Chau");
			}
			else
				System.out.print(i);
			System.out.print(" ");
			if(count>10)
			{
				System.out.println("");
				count=0;
			}
		}
	}

}
