import java.util.Scanner;

public class itemType {
    private String name;
    private double Deposit;
    private double costPerDay;

    public itemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.Deposit = deposit;
        this.costPerDay = costPerDay;
    }


    @Override
    public String toString() {
        return  "Name='" + name  + "\nDeposit=" + Deposit + "\ncostPerDay=" + costPerDay;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type detail: ");
        System.out.println("Enter the item name= ");
        String name =sc.nextLine();

        try {
            System.out.println("Enter the deposit= ");
            double deposit=Double.parseDouble(sc.nextLine());
            System.out.println("enter the cost per day= ");
            double costPerDay=Double.parseDouble(sc.nextLine());
            System.out.println("The detail of the input type are= ");
            //System.out.println("Name= "+name);
            //System.out.println("Deposit= "+ deposit);
            //System.out.println("Cost Per Day= "+costPerDay);
            itemType ItemType=new itemType( name, deposit, costPerDay);
            System.out.println(ItemType);

        }

        catch (NumberFormatException p){
            System.out.println(p);
        }
        sc.close();
    }
}
