public class Main {
    int amount;
    public void setAmount(){
        amount=50000;
    }
    public void withdraw(int amt){
        amount=amount-amt;
        System.out.println("withdraw amount= "+ amt);
    }
    public int displayBalanceAmount(){
        return amount;

    }

    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println("setting the intital amount");
        obj.setAmount();
        System.out.println("current amount= "+ obj.displayBalanceAmount());
        obj.withdraw(20000);
        System.out.println("Balance Amount= "+ obj.displayBalanceAmount());
    }
}
