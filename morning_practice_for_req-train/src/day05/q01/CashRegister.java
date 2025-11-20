package day05.q01;

public class CashRegister {
	//税抜き価格
	int price;
	
	public int calcPrice() {
		double cashPrice = price * 1.1;
		int cash = (int)cashPrice;
		return cash;
	}
}
