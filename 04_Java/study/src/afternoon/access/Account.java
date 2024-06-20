package afternoon.access;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        this.balance -= amount;
    }
}
