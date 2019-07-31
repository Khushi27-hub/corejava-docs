package Demo;

public class ArrayProg {
	public static void main(String[] args) {
		String arr[] = new String[]{"Sumani","Rohit","Ashish","Abhishek"};
		String[] friends = {"Rachel","Phoebe","Monica","Chandler","Ross","Joey"};
		for(String x:arr)
			System.out.println(x);
		for(int i=0;i<friends.length;i++)
			System.out.println(friends[i]);
	}
}