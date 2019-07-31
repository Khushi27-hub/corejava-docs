
public class Cube {
	public static int cubes(int a)
	{
		return a*a*a;
	}

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
			System.out.print(cubes(i)+ ",");
	}
}
