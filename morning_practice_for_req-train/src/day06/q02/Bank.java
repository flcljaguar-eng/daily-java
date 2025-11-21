package day06.q02;

/**
 * 銀行クラス
 */
public class Bank {
	private String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depositor depositer = new Depositor();
	
	public void showData() {
		System.out.println("銀行情報を表示します");
		System.out.println("bankcode:"+ bankCode);
		System.out.println("bankName:"+ bankName +"\n");
		
		depositer.showData();
	}

	public void setDepositer(Depositor depositer) {
		this.depositer = depositer;
	}

	public Depositor getDepositer() {
		return depositer;
	}
}	
