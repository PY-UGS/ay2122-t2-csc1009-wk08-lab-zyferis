import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount("abc123", 0.0f);

        System.out.println("input amount to deposit: ");
        Scanner i = new Scanner(System.in);
        float money = i.nextFloat();
        c.deposit(money);
        System.out.println("input amount to withdraw: ");
        money = i.nextFloat();
        try {
            c.withdraw(money);
            System.out.printf("The balance after withdraw is: $%.2f",c.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.printf("Sorry, but your account is short by: $%.2f",e.getAmount());
        }

        i.close();
    }
}
