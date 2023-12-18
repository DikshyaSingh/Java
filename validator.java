import java.util.Scanner;
class ageinvalid extends Exception{
    public ageinvalid(String str){
        super(str);
    }
}
public class validator {
     static void male(int age) throws ageinvalid {
        if (age < 23) {
            throw new ageinvalid("you cannot get married");
        } else {
            System.out.println("you can get married ");
        }
    }

     static void female(int age) throws ageinvalid {
        if (age < 23) {
            throw new ageinvalid("you cannot get married");
        } else {
            System.out.println("you can get married ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your gender");
        String gender=sc.nextLine();
        try {
            if(gender.equalsIgnoreCase("male")){
                System.out.println("enter your age ");
                int age=sc.nextInt();
                male(age);
            } else if (gender.equalsIgnoreCase("female")) {
                System.out.println("enter your age ");
                int age= sc.nextInt();
                female(age);
            }
            else {
                System.out.println("wrong age");
            }
        }
        catch (ageinvalid ex){
            System.out.println(ex.getMessage());
        }
    }

}
