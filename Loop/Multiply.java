import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคุณเริ่มต้น : ");
        int start = kb.nextInt();
        System.out.print("ป้อนแม่สูตรคูณสุดท้าย : ");
        int stop = kb.nextInt();
        System.out.println("###########");
        for(int m = start; m <= stop; m++){
            System.out.println("=========== แม่ที่ = "+m);
           for(int i = 1; i <= 12 ; i++){
               System.out.println( m + " x "+ i + " = " + (m*i));
           }
        }
    }
}
