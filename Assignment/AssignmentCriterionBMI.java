import java.util.Scanner;
public class AssignmentCriterionBMI {
    // โปรแกรมวัดค่าเกณฑ์ดัชนีมวลกาย
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนนํ้าหนัก (kg) : ");
        double weight = sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) : ");
        double height = sc.nextDouble();
        height /= 100; // height=height/100;

        double bmi = weight / (height * height);

        System.out.println("นํ้าหนัก = " + weight);
        System.out.println("ส่วนสูง = " + height);
        System.out.println("ค่าดัชนีมวลกาย = " + bmi);
        String predict="";

        if(bmi<17.9){
            predict = "ตํ่ากว่าเกณฑ์";
        }else if(bmi>=18.0 && bmi<=22.9){
            predict = "สมส่วน";
        }else if (bmi >= 23.0 && bmi <= 24.9) {
            predict = "นํ้าหนักเกิน";
        }else if (bmi >= 25.0 && bmi <= 29.9) {
            predict = "โรคอ้วน";
        }else if (bmi >= 30 && bmi <= 70) {
            predict = "โรคอ้วนระดับอันตราย";
        }else{
            predict = "ไม่ทราบค่า";
        }
        System.out.println("ทำนายผล = "+predict);
        /**
         * น้อยกว่า 18 = ตํ่ากว่าเกณฑ์
         * 18.5 - 22.9 = สมส่วน
         * 23.0 - 24.9 = นํ้าหนักเกิน
         * 25.0 - 29.9 = โรคอ้วน
         * มากกว่า 30 = โรคอ้วนระดับอันตราย
         */
    }
}
