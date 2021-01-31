import java.util.Scanner;
public class AssignmentBanknoteExchange  {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป่อนจำนวนเงิน = ");
        int money = kb.nextInt();
        System.out.println("จำนวนเงิน = "+money);

        if(money>=1000){
            System.out.println("1000 บาท เท่ากับ " + (money / 1000)+" ใบ");
            money%=1000;
        }
        if (money >= 500) {
            System.out.println("500 บาท เท่ากับ " + (money / 500) + " ใบ");
            money %= 500;
        }
        if (money >= 100) {
            System.out.println("100 บาท เท่ากับ " + (money / 100) + " ใบ");
            money %= 100;
        }
        if (money >= 50) {
            System.out.println("50 บาท เท่ากับ " + (money / 50) + " ใบ");
            money %= 50;
        }
        if (money >= 20) {
            System.out.println("20 บาท เท่ากับ " + (money / 20) + " ใบ");
            money %= 20;
        }
        if (money >= 10) {
            System.out.println("10 บาท เท่ากับ " + (money / 10) + " เหรียญ");
            money %= 10;
        }
        if (money >= 5) {
            System.out.println("5 บาท เท่ากับ " + (money / 5) + " เหรียญ");
            money %= 5;
        }
        if (money >= 1) {
            System.out.println("1 บาท เท่ากับ " + (money / 1) + " เหรียญ");
            money %= 1;
        }
    }
}
/**
    โปรแกรมแลกธนบัตร
    ประกอบด้วย => 1000, 500, 100, 50, 20

    เช่น
    ####################
    2000 จะได้
    แบงค์ 1000 = 2 ใบ
    ###################
    1500 จะได้
    แบงค์ 1000 = 1 ใบ
    แบงค์ 500 = 1 ใบ
    ###################
    1800 จะได้
    แบงค์ 1000 = 1 ใบ
    แบงค์ 500 = 1 ใบ
    แบงค์ 100 = 3 ใบ
    ###################
    100 จะได้
    แบงค์ 100 = 1 ใบ
    ###################
    100 จะได้
    แบงค์ 100 = 1 ใบ
    ###################
    90 จะได้
    แบงค์ 50 = 1 ใบ
    แบงต์ 20 = 2 ใบ
    ###################
    70 จะได้
    แบงค์ 50 = 1 ใบ
    แบงต์ 20 = 1 ใบ
    ###################
 */