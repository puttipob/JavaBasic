public class VariableGlobalLocal {
    public static void main(String[] args) {
        //Global Variable
        int a = 100;
        int b = 200;
        System.out.print(a);
        {
            int c = 300; //local variable
            System.out.println("A = "+a);
            System.out.println(c);
        }
        System.out.println(b);
    }
}
