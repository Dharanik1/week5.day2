package Week5.day2;

public class MyBank extends SBI implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI info = new SBI();
		info.openAccount();
		info.providCreditCard();
		info.provideDebitCard();
		RBI info2 = new SBI();
		info2.openAccount();
		info2.provideDebitCard();

	}

}
