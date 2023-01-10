import org.w3c.dom.ls.LSOutput;

public class Account {

    private String name;
    private double balance;
    private String accountNumber;


    public Account () {
        this.name = name;

        if (balance > 0.0){
            this.balance = balance;
        }

    }
        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
        return name;
        }

        public double getBalance() {
        return balance;
        }

        public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
        public double withdrawal(double withdraw) {
            balance = balance - withdraw;
            if (balance < withdraw) {
                return 0;
            }
           return balance;
            }

        public double deposit(double deposit) {
            if (deposit > 0) {
                balance = balance + deposit;
            }
             return balance;
        }
    }