
public class SBI extends Bank {
    public SBI(String name,long accountNo, String password, long balance) {
      this.name= name;
      this.accountNo=accountNo;
      this.password=password;
      //this.balance=balance;
        setBalance(balance);

    }

}