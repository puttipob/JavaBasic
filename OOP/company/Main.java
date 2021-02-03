public class Main {
    public static void main(String[] args) {
        Programmer e1 = new Programmer();
        e1.bonus();
        Accounting ac = new Accounting();
        ac.bonus();

        /*
        // Inhertitance =========================================================      
        Programmer p1 = new Programmer("Alen", 30000.0);
        Accounting ac = new Accounting("Alice", 20000.0);
        System.out.println(Company.NAME);

        // static method =========================================================
        System.out.println(Company.name);

        Company.service();

        // มี Default Constructor =========================================================
        Employee e1 = new Employee("1", "Puttipob", 12000.0);  //Create Object
        e1.displayEmployee();
        Employee e2 = new Employee();
        Employee e3 = new Employee("3", "Alen");
        e3.displayEmployee();

        // ไม่มี Default Constructor =========================================================
        Employee e1 = new Employee(); // Create Object
        e1.setId("1");
        e1.setName("Puttipob");
        e1.setSalary(12000.0);
        System.out.println("Name = " + e1.getName());
        System.out.println("Salary = " + e1.getSalary());

        Employee e2 = new Employee(); // Create Object
        e2.setId("2");
        e2.setName("Alen");
        e2.setSalary(50000.0);
        System.out.println("Name = " + e2.getName());
        System.out.println("Salary = " + e2.getSalary());
        */
    }
}
