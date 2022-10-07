public class Bank {
   protected String name;
    protected long accountNo;
    protected String password;
    private long balance;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Your balance is  " + balance);
    }

    void addMoney(long x)
    {
        balance+=x;
        System.out.println( "Rupees" + x+ "Money Added Successfully");
    }

    void withdrawMoney(long x)
    {
        if(x<balance)  {
            balance -= x;
            System.out.println("Rs " + x + " Withdrawn Successfuly");
        }
        else System.out.println("Insufficient balance");
    }
    void changePassword(String oldPassword, String newPassword)
    {
        if(this.password.equals(oldPassword)) {
            this.password=newPassword;
            System.out.println("Password changes successfully");
        }
        else {
            System.out.println("your oldPassword is given wrong");
        }
    }

}
