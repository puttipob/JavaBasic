import java.util.Scanner;
public class AndOrNot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age = kb.nextInt();

        if(!(age>=15)){
            System.out.println("เด็กชาย/เด็กหญิง");
        }else{
            System.out.println("นาย/นางสาว");
        }
    }
}
