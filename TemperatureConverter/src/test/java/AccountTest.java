import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    Account account;
    Account emptyAccount;
    @BeforeEach
    void setUp() {
         account = new Account(100.0);
         emptyAccount = new Account();

    }

    @Test
    void withdraw() {
        assertEquals(50, account.withdraw(50));
        assertEquals(0, account.withdraw(200));
        assertEquals(0, account.withdraw(-20));
        assertEquals(50, account.withdraw(50));
        assertEquals(0, emptyAccount.withdraw(10));


    }

    @Test
    void deposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance());
        account.deposit(-20);
        assertEquals(150, account.getBalance());
        assertEquals(0, emptyAccount.getBalance());
        emptyAccount.deposit(30);
        assertEquals(30, emptyAccount.getBalance());
    }

    @Test
    void getBalance() {
        assertEquals(100, account.getBalance());
        account.deposit(50);
        assertEquals(150, account.getBalance());
        account.withdraw(70);
        assertEquals(80, account.getBalance());
        assertEquals(0, emptyAccount.getBalance());
    }
}