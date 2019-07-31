package logic.driver;
import java.util.*;
import logic.*;

public class BookDetails{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Books book1 = new Books();
		EngineeringBook book2 = new EngineeringBook();
		//EngineeringBook book3 = new Books();
		int bookNumber = Integer.parseInt(scan.nextLine());
		String authorName = scan.nextLine();
		int price = Integer.parseInt(scan.nextLine());
		String title = scan.nextLine();
		String category = scan.nextLine();
		try {
			
			book2.setBookNo(bookNumber);
			book2.setAuthor(authorName);
			book2.setPrice(price);
			book2.setTitle(title);
			book2.setCategory(category);
			
			//System.out.println("Author: "+book1.getAuthor()+", Prices: "+book1.getPrice()+", Title: "+book1.getTitle()+", Book Number: "+book1.getBookNo());
			System.out.println(book2.getPrice()+", "+book2.getCategory());
			
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		scan.close();
	}
}
