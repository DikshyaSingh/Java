/******Exercise******
1. Create a bank_account class
2. Create private member variable for Account number,Account name and Account Balance
3. Create Method to deposit nd withdraw the amount and to display the current balance
4. Create an constructor with arguments for Account name,number and balance
5.Create a class BankAccount_Main with a main method
6.Create an object of Bank_Account
7.call the method to deposit and withdraw the money from bank account and display the current balance
 */
public class bank_account {
    private  long acNo;
    private  String acname;
    private double Account_balance;
    public void deposit(double amt){
        if(amt>0){
            Account_balance = Account_balance + amt;
            System.out.println("successfuly deposited " + amt);
        }else{
            System.out.println("cannot deposit "+ amt);
        }
    }
    public void withdraw(double amt){
        if(amt>0){
            Account_balance=Account_balance + amt;
            System.out.println("successfully withdraw " + amt);
        }else{
            System.out.println("cannot withdraw "+ amt);
        }
    }
    public void displaycurrentBalance(){
        System.out.println("display current amount"+ Account_balance);
    }
    public bank_account(long acNo,String acname, double Account_balance){
        this.acNo=acNo ;
        this.acname= acname;
        this.Account_balance= Account_balance;
    }
    public static class BankAccount_main{
        public static void main(String[] args) {
            bank_account bn=new bank_account(128222356,"Dikshya",100000);
            bn.displaycurrentBalance();
            bn.withdraw(2000);
            bn.deposit(1000);
            bn.displaycurrentBalance();
        }
    }
}
