package Demo;

class Movie{
	private int MovieId;
	private String title;
	void setValue(int mId, String mTitle) {
		MovieId=mId;
		title=mTitle;
	}
	int getMId() {
		return MovieId;
	}
	String getMName() {
		return title;
	}
}

public class MovieDemo {
	public static void main(String[] args) {
	Movie movie = new Movie();
	movie.setValue(10,"abc");
	System.out.println(movie.getMId());
	System.out.println(movie.getMName());
	}
}
