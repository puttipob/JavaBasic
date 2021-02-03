class Programmer extends Employee{
    
    //overload Method
    public void skill(){
        System.out.println("No skill");
    }
    public void skill(String...language) {
        for(int i = 0;i<language.length;i++){
            System.out.println("Skill = " + language[i]);
        }
    }
    //Override
    public void bonus() {
        System.out.println("Bonus = 10%");
    }
    /** 
    public String skill = "JAVA C#";
    //Method
    public Programmer(String name, Double salary){
        super(name,salary);
        System.out.println("I'm Programmer");
    }
    */
}
