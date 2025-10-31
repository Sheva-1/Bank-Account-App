import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountId;
    private String accountNumber;
    private double accountBalance;
    private Client client;
    private List<Operation> operations;

    public Account(int accountId, String accountNumber, Client client) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.client = client;
        this.operations = new ArrayList<>();
        this.accountBalance = 0.0;
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
        if (operation.getType().equalsIgnoreCase("Deposit")) {
            accountBalance += operation.getAmount();
        } else if (operation.getType().equalsIgnoreCase("Withdrawal")) {
            accountBalance -= operation.getAmount();
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void displayAccountDetails() {
        System.out.println("Client:         " + client.getFullName());
        System.out.println("Account No:     " + accountNumber);
        System.out.println("\nOperations:\n");
        System.out.printf("%-15s %-15s %-15s%n", "Date", "Type", "Amount");

        for (Operation op : operations) {
            System.out.printf("%-15s %-15s %-15.2f%n",
                    op.getDate(), op.getType(), op.getAmount());
        }

        System.out.println("\nBalance:        " + accountBalance);
    }
}
