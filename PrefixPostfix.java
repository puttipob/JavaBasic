public class PrefixPostfix {
    public static void main(String[] args) {
        // increment
        int a = 5;
        //pre หน้า | post หลัง
        System.out.println(a); //5
        System.out.println(++a); //6
        System.out.println(a); //6

        a = 5;
        System.out.println(a); //5
        System.out.println(a++); //5
        System.out.println(a); //6

        // decrement
        int b = 5;
        // pre หน้า | post หลัง
        System.out.println(b); // 5
        System.out.println(--b); // 4
        System.out.println(b); // 4

        b = 5;
        System.out.println(b); // 5
        System.out.println(b--); // 5
        System.out.println(b); // 4
    }    
}
