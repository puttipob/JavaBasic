class Employee{
    //Attribute
    private String id;
    private String name;
    private Double salary;

    //Static Attribue
    static int minSalary = 12000;

    //Default Constructor
    public Employee(){
        System.out.println("I'm Emplyee");
    }
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    //Method
    //Setter กำหนดข้อมูล
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Getter ดึงขอมูลออกไป
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void bonus(){
        System.out.println("Show Bounus Employee");
    }

    public void displayEmployee() {
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }


}