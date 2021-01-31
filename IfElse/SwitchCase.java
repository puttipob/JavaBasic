import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนเลขเดือน = ");
        int month = kb.nextInt();
        String name;

        switch(month){
            case 1:
                name = "มกราคม";
                break;
            case 2:
                name = "กุมภาพันธ์";
                break;
            case 3:
                name = "มีนาคม";
                break;
            case 4:
                name = "เมษายน";
                break;
            case 5:
                name = "พฤษภาคม";
                break;
            case 6:
                name = "มิถุนายน";
                break;
            case 7:
                name = "กรกฎาคม";
                break;
            case 8:
                name = "สิงหาคม";
                break;
            case 9:
                name = "กันยายน";
                break;
            case 10:
                name = "ตุลาคม";
                break;
            case 11:
                name = "พฤษจิกายน";
                break;
            case 12:
                name = "ธันวาคม";
                break;
            default:
                name = "ไม่พบเดือน";
                break;
        }
        System.out.print(name);
    }
}
