public class HDFC extends Bank {
    public HDFC(String name,long accountNo, String password, long balance) {
        this.name= name;
        this.accountNo=accountNo;
        this.password=password;
       // this.balance=balance;
        setBalance(balance);
    } // try

}