public class Methods {
    //creating the method without arguments
    public void doThis() {
        System.out.println("do this is executed");
    }

    //creating the method with arguments
    public void addition(int a, int b) {
        System.out.println(a+b);
    }

    //creating the method with arguments and returning the value
    public int multiply(int a, int b) {
        int c =a * b;
        return c;
    }

    public static void main(String[] args) {
        Methods m =new Methods();
        m.doThis();
        m.addition(10, 20);
        int x =m.multiply(10, 2);
        System.out.println(x);

    }
}
