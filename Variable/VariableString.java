public class VariableString {
    public static void main(String[] args) {
        String a = "100", b = "200";

        //String => Double
        double c = Double.parseDouble(a);
        c = c + 3.55;
        System.out.print(c);

        //Integer => String
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.print(age);
    }
}
