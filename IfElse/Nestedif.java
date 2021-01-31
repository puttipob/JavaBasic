import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุคุณ : ");
        int age = kb.nextInt();

        if(age>=13 && age<=15){
            System.out.println("มัธยมตอนต้น");
            if(age==15){
                System.out.println("ม.3");
            }else if (age == 14) {
                System.out.println("ม.2");
            }else if (age == 13) {
                System.out.println("ม.1");
            }
        }else if (age >= 16 && age <= 18){
            System.out.println("มัธยมตอนปลาย");
            if (age == 18) {
                System.out.println("ม.6");
            } else if (age == 17) {
                System.out.println("ม.5");
            } else if (age == 16) {
                System.out.println("ม.4");
            }
        }else{
            System.out.println("ไม่ได้เรียนระดับชั้นมัธยม");
        }
    }
}
