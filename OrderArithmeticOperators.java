public class OrderArithmeticOperators {
    public static void main(String[] args) {
        float a = 5 + 8 * 9; // 9*8 => 72 => 13+5 => 77
        float b = 10 - 4 + 2; // 10-4 => 6 => 6+2 => 8
        float c = 10 - ( 2 + 1 ); // 2+1 => 3 => 10-3 => 7
        float d = 5 * 2 - 40 / 5; // 5*2 => 10 => 40/5 => 8 => 10-8 => 2
        float e = 7 + 8 / 2 + 25; // 8/2 => 4 => 7+4 => 11 => 11+25 => 36

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
