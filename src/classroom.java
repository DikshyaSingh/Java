//data encapsulation is also called as data hiding
//i.e hiding the member variable of the class from the other class
//getter and setter can help others to access variable of my class indirectly

public class classroom {
    private String sub1;
    private  int stdcount;

    public String getSub(){
        return sub1;
    }
    public void setSub(String sub) {
        this.sub1 = sub;
    }

    public int getStdcount(int i) {
        return stdcount;
    }

    public void setStdcount(int stdcount) {
        this.stdcount = stdcount;
    }
    public void displaydetails(){
        System.out.println("thiss is "+ sub1+"class and it has "+ stdcount+" students");
    }
}
class classroom_main{
    public static void main(String[] args){
        classroom cls1=new classroom();
        cls1.setSub("java");
        cls1.setStdcount(45);
        cls1.displaydetails();
    }
}
