import java.util.Scanner;
public class ModLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("ป้อนตัวเลข = ");
            int number = kb.nextInt();
            if(number<0)break;

            if(number%2 == 0){
                System.out.println("เลขคู่");
            }else{
                System.out.println("เลขคี่");
            }
        }

    }
}
