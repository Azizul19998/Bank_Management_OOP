public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI("azizul", 1234, "aziz123", 50);
        HDFC hdfc = new HDFC("mallick", 56789, "mallick123", 1200);

        sbi.checkBalance();
//        sbi.addMoney(500);
//        sbi.checkBalance();
//        sbi.withdrawMoney(70);
//        sbi.withdrawMoney(700);
//        sbi.checkBalance();


//        hdfc.checkBalance();
//        hdfc.balance = 600; // here i can manipulate the data bcz of access modifies, security issue;
//        hdfc.checkBalance();

//        hdfc.changePassword("mallick123", "iloveyou");

    }
}