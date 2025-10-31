public class Client {
    private int clientId;
    private String firstName;
    private String lastName;

    public Client(int clientId, String firstName, String lastName) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
