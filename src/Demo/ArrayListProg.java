package Demo;
import java.util.*;
import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Khushi");
		friends.add("Khushboo");
		friends.add("Khushee");
		friends.add("Khush");
		for(String x:friends)		//Enhanced For Loop
			System.out.println(x);
		System.out.println(friends);
		Iterator<String> itr = friends.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		itr.forEachRemaining(a->
		{
			System.out.println(a);
		});
	}
}
