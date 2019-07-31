import java.util.*;

public class Alphabet {	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String start = scan.nextLine();
		String end = scan.nextLine();
		
		for(char i = start.charAt(0);i<=end.charAt(0);i++)
			System.out.println(i);
	scan.close();
	}
}
