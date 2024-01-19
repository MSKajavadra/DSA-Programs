//07-02-2023
public class prog3 {
    public static void main(String[] args) {
        Account1 acc1=new Account1();
        acc1.setAccountDetails(2001,"Maulik",20000);
        acc1.withdraw(5000);
        acc1.dispAccountDetails();
        acc1.deposite(15000);
        acc1.dispAccountDetails();
    }
}
class Account1{
    private int  accNo;
    private String custName;
    private int accBalance;
    public void setAccountDetails(int accNo,String custName,int accBalance){
        this.accNo=accNo;
        this.custName=custName;
        this.accBalance=accBalance;
    }
    public void withdraw(int amount){
        if(amount > accBalance){
            System.out.println("Inefficient Balance");
            return;
        }
        accBalance-=amount;
    }
    public void deposite(int amount){
        accBalance+=amount;
    }
    public void dispAccountDetails(){
        System.out.println(accNo+" "+custName+" "+accBalance);
    }
}