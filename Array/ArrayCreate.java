public class ArrayCreate {
    public static void main(String[] args) {
        //การสร้าง Array

        //แบบกำหนดขนาดเอาไว้
        int[]  num = new int[10];

        //กำหนดค่าลงไป
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        System.out.println("ตำแหน่งที่ 4 = "+ num[4]);

        //แบบกำหนดสมาชิก
        int[] number = {10, 20, 30, 40, 50, 60};
        System.out.println("ตำแหน่งที่ 5 = " + number[5]);
        number[5] = 100;
        System.out.println("ตำแหน่งที่ 5 = " + number[5]);
    }
}
