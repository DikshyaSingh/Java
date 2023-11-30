import static java.lang.System.*;

 class static_keyword {
    static String name="ram";
    int age=6;

    public void displayDetails(){
       System.out.println("student's name is "+name+" and their age is " + age);
    }
}
class static_main{
    public static void main(String[] args){
        static_keyword st1=new static_keyword();

        static_keyword.name="dikshya";
        st1.age=2;
        st1.displayDetails();

    }
}
