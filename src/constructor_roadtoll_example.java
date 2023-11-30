//constructor is a block of code similar to method that gets executed when the instance of the class is creadted
//generally used to initialize the member variable of class
//constructor name is same as that of class name
//constructor does not have any return type
//constructor overloading means having same class name but different parameter
public class constructor_roadtoll_example {
    String type;
    int tyrecount;

    public void toll_amount() {
        if (tyrecount == 2) {
            System.out.println("your toll amount is 0");
        } else if (tyrecount == 4) {
            System.out.println("your toll amount is 10");
        } else if (tyrecount > 4) {
            System.out.println("your toll amount is 20");
        } else {
            System.out.println("incorrect tyre count");
        }
    }
    public constructor_roadtoll_example() {

        System.out.println("constructor is executed");
    }
    //@overloading
    public constructor_roadtoll_example(String type,int tyrecount) {
        this.type= type;//this means the current type
        this.tyrecount= tyrecount;
    }
    public static class roadtoll_main {
        public static void main(String[] args) {
            constructor_roadtoll_example rd = new constructor_roadtoll_example();
            rd.type="sadan";
            rd.tyrecount=4;
            rd.toll_amount();

            constructor_roadtoll_example rd1 = new constructor_roadtoll_example("svs",2);
            rd1.toll_amount();
        }
    }
}
