public class Customer {
    // Declare instance variables
    private String username, password, name;
    private double balance;
    private int id;

    public Customer(){

    }

    public Customer(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
        setId();
        // Initialize balance to zero
        this.balance = 0;
    }

    // Assign the user an ID number
    private void setId(){
        // Generate a random 6 digit id number
        this.id = (int)Math.floor(Math.random()*(999999-100000+1)+100000);
    }

    // Return the balance of the account
    public double getBalance(){
        return this.balance;
    }

    // Make a deposit into the account
    public void deposit(){

    }

    // Make a withdrawal from the account
    public void withdraw(){

    }

}
