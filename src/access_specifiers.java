public class access_specifiers {
    // public can be accessed everywhere any class, packages,project
    public void doThisPublic(){
        System.out.println("public method");
    }
    // private can be accessed in same  class but not in different packages,project
    private void doThisPrivate(){
        System.out.println("private method");
    }
    // default can be accessed everywhere any class, packages but not in different project
    void doThis(){
        System.out.println("default method");
    }

    public static void main(String[] args) {
        access_specifiers ac = new access_specifiers();
        ac.doThisPrivate();
        ac.doThisPublic();
        ac.doThis();
    }
}


