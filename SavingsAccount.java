
public class SavingsAccount {
String UserName ;
int pin;
double balance;
	public SavingsAccount(String UserName2, int pin2, double balance2 ) {
		// TODO Auto-generated constructor stub
		UserName = UserName2;
		pin = pin2;
		balance = balance2;
	}
public double Withdraw(double withdraw){
	
	balance = balance - withdraw ;
	
	return balance;

	
}

public double Deposit (double deposit){
	balance = deposit + balance ;
	return balance ;
}
}
