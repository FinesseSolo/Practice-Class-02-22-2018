import java.util.Scanner;
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount person1 = new SavingsAccount ("Jay", 100134, 100);	
SavingsAccount person2 = new SavingsAccount ("Aileen",100190,1000);
SavingsAccount person3 = new SavingsAccount ("John",100153,3213);

Scanner scanner = new Scanner (System.in);

System.out.println("Please enter the details for the CurrentAccount");
SavingsAccount CurrentAccount = new SavingsAccount (scanner.next(), scanner.nextInt(), scanner.nextDouble());

System.out.println("Please enter the details for the OverDrafttAccount");
SavingsAccount OverDraftAccount = new SavingsAccount (scanner.next(), scanner.nextInt(), scanner.nextDouble());

System.out.println("Please enter your withdrawal amount for the CurrentAccount and show the remaining balance" + CurrentAccount.Withdraw(scanner.nextDouble()));


	}

}
