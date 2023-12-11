/*interface is a collection of abstract methods
class can implement interface
interface can extend from another interface
interfacecan not be instantiatted
they do not have constructor
they cannot have data members.all variable by default as static final
everything is public by default

*/

public class interface_main {
    public static void main(String[] args) {

    }
    public interface int1 {
        static final int a=100;
        void doThis();
    }

    public class class1 implements int1 {

        @Override
        public void doThis() {
            System.out.println("hi dikshya");
        }
    }

    public interface int2 extends int1 {
        void dothat();
    }

    public class class2 implements int2 {

        @Override
        public void doThis() {

        }

        @Override
        public void dothat() {

        }
    }
}
