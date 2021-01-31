import java.util.Scanner;
public class SummationLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 0, count = 0, avg = 0;
        while(true){
            System.out.print("ป้อนตัวเลขของคุณ (ป้อนค่าลบจบโปรแกรม) = ");
            int number = kb.nextInt();
            if(number < 0)break;
            count++;
            sum+=number; //ผลรวมตัวเลข 0 + 1
        }
        System.out.println("ผลรวม = "+sum);
        System.out.println("ค่าเฉลี่ย = " + (sum/count));
    }
}
