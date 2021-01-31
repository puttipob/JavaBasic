import java.util.Scanner;
public class ThrowDemo {
    //โปแกรมถอนเงิน
    //บัญชีเงินฝาก
    public static void main(String[] args) {
        try{
            int balance = 5000;
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนจำนวนเงินที่ต้องการถอน = ");
            int withdraw = kb.nextInt();
            if(withdraw<=0){
                throw new Exception("กรุณาป้อนจำนวนเงินเป็นค่ามากกว่า 0");
            }
            if (withdraw > balance) {
                throw new Exception("ยอดเงินคงเหลือไม่พอ");
            }
            balance-=withdraw;
            System.out.println("ถอนเงินไป = " + withdraw);
            System.out.println("ยอดเงินคงเหลือ = " + balance);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}