public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
    }
    public Account(double initialBalance){
        this.balance = initialBalance;
    }
    public double withdraw(double amount){
        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;
            return amount;
        }
        return 0.0;

    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }

    }
    public double getBalance() {
        return this.balance;
    }
}
