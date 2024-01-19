//07-02-2023
public class prog2 {
    public static void main(String[] args) {
        Account acc1=new Account(1021,"Maulik",25000);
        acc1.calculateInterest();
        acc1.displayAccountDetail();
    }
}
class Account{
    private int accNo;
    private String custName;
    private int balance;
    private int interestRate=4;
    public Account(int accNo,String custName,int balance){
        this.accNo=accNo;
        this.custName=custName;
        this.balance=balance;
    }
    public void calculateInterest(){
        balance+= (balance*interestRate)/100;
    }
    public void displayAccountDetail(){
        System.out.println(accNo+" "+ custName + " " + balance);
    }
}
