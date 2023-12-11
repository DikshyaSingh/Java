public class super_keyword {
    public static class A {
        int num1 = 100;

        public void doThis() {
            System.out.println("do this from A");
        }
    }

    public static class B extends A {
        int num1 = 200;

        public void doThis() {
            System.out.println("do this from B");
        }

        public void xyz() {
            System.out.println(super.num1);
            super.doThis();
            System.out.println("xyz executed");
        }
    }


        public static void main(String[] args) {
            B b1 = new B();
            b1.xyz();
        }
}


