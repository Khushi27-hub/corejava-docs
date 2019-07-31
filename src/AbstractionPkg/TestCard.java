package AbstractionPkg;

public class TestCard {

	public static void main(String[] args) {
		TravelCard card1 = new TravelCard();
		card1.swipeLimit = 100;
		card1.availableBalance=300000;
		card1.swipeCard(90);
		card1.swipeCard(80);
		card1.swipeCard(90);
		System.out.println(card1);
	}

}
