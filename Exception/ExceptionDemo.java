import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {
    /** 
    ตัวอย่าง Exception
    ArrayIndexOutOfBoundsException
    ArithmException
    ZeroDivisionException
    IOException
    FileNotFoundException
    */
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("ห้ามหารด้วย 0 นะครับ");
        }

        try {
            int[] item = { 10, 20, 30 };
            System.out.println(item[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not correct");
        }

        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนด้วยตัวเลข = ");
            int number = kb.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("ป้อนตัวเลขเท่านั้นนะครับ");
        }

        // กรณีไม่อยากระบุ Exception เอง
        try{
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนด้วยตัวเลข = ");
            int number = kb.nextInt();
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //ยังคงทำคำสั่งอื่นๆ
            System.out.println("ทำงานอย่างอื่นๆ...");
        }
    }
}
