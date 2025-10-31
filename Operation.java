import java.time.LocalDate;

public class Operation {
    private LocalDate date;
    private String type;
    private double amount;

    public Operation(LocalDate date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
