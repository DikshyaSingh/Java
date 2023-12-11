//method overloading is having methods name in same class but different arguments
public class polymorphism {
    public static class Animal {
        void whoAmI() {
            System.out.println("I am a animal");
        }
    }
    //inheritance
    public static class cat extends Animal {
        void whoAmI() {
            System.out.println("I am a cat");
        }
    }
    public static class dog extends Animal {
        void whoAmI() {
            System.out.println("I am a dog");
        }
    }
    public static void main(String[] args) {
        Animal a;
        a=new Animal();
        a.whoAmI();
        a=new dog();
        a.whoAmI();
        a=new cat();
        a.whoAmI();
    }



}
