import java.time.LocalDate;

public class BankApp {
    public static void main(String[] args) {
        Client client = new Client(1, "John", "Paul");
        Account account = new Account(101, "0090045", client);

        account.addOperation(new Operation(LocalDate.of(2021, 9, 15), "Deposit", 4000000));
        account.addOperation(new Operation(LocalDate.of(2021, 9, 30), "Withdrawal", 2000000));
        account.addOperation(new Operation(LocalDate.of(2021, 10, 5), "Deposit", 5000000));
        account.addOperation(new Operation(LocalDate.of(2021, 10, 15), "Deposit", 6000000));
        account.addOperation(new Operation(LocalDate.of(2021, 11, 5), "Withdrawal", 3000000));
        account.addOperation(new Operation(LocalDate.of(2021, 11, 10), "Withdrawal", 1000000));
        account.addOperation(new Operation(LocalDate.of(2021, 11, 15), "Deposit", 1000000));

        account.displayAccountDetails();
    }
}
