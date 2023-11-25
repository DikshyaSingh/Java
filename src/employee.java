class emp {
    String employee_name = "Dikshya Singh";
    int employee_id = 2278;
    int employee_salary = 80000;

    public void employee_bonous() {
        System.out.println("employee " + employee_name + "of employee id" + employee_id + "has a salary of" + employee_salary);
        System.out.println("employee " + "gets the bonous of" + (employee_salary * 0.2));

    }
}

public class employee {
    public static void main(String[] args)
    {
        emp emp1=new emp();
        emp emp2=new emp();


        emp1.employee_name ="ram";
        emp1.employee_id=998;
        emp1.employee_salary =10000;

        emp1.employee_bonous();

        emp2.employee_name ="rmama";
        emp2.employee_id=9998;
        emp2.employee_salary =20000;

        emp2.employee_bonous();


    }
}