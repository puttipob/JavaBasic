import java.util.Scanner;
public class AssignmentBMI {
    // โปรแกรมวัดค่าดัชนีมวลกาย
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนนํ้าหนัก (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) : ");
        double height = sc.nextDouble();
        height/=100; //height=height/100;

        double bmi = weight/(height*height);

        System.out.println("นํ้าหนัก = " + weight);
        System.out.println("ส่วนสูง = " + height);
        System.out.println("ค่าดัชนีมวลกาย = " + bmi);
    }
}
