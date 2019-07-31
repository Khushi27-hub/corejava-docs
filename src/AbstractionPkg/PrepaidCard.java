package AbstractionPkg;

abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int amount);
	public abstract String toString();
	double rechargeCard(double amount) {
		availableBalance+=amount;
		return availableBalance;
	}
}
