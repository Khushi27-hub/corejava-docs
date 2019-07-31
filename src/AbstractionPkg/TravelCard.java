package AbstractionPkg;

interface rewardable{
	int rewards(int amount);
}

public class TravelCard extends PrepaidCard implements rewardable{
	int rewardPoints;
	double totalExpense;
	
	boolean swipeCard(int amount)
	{
		if(amount<=swipeLimit && availableBalance>amount)
		{	
			totalExpense+=amount;
			rewards(amount);
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		String x = "Swipe Limit"+ swipeLimit+"\nBalance"+availableBalance+"\nReward Points"+rewardPoints;
		return x;
	}
	public int rewards(int amount) {
		rewardPoints=(int)Math.floor(totalExpense/20);
		return rewardPoints;
	}
	
}
