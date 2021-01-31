import java.util.Scanner;
public class AssignmentConvertYear {
    //โปรแกรมเปลง พ.ศ เป็น ค.ศ
    public static void main(String[] args) {
        //รับค่า
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนตัวเลข (พ.ศ) = ");
        int number = kb.nextInt();

        //ประมวลผล
        //2563 - 543 -> ต.ศ
        //ค.ศ + 543 = พ.ศ

        int result = number-543;
        System.out.print(number + "แปลงเป็น ค.ศ = "+result);
    }
}
