import java.lang.Math;
public class MathDemo {
    public static void main(String[] args) {
        //ค่าคงที่ใน ClassMath;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        int r = 2;
        double area = Math.PI * r *r;
        System.out.println(area);

        int num = -30;
        System.out.println(Math.abs(num));

        //ปัดเศษ
        double number = 14.4;
        System.out.println(Math.ceil(number)); //ปัดขึ้น
        System.out.println(Math.floor(number)); // ปัดลง

        // <= .5 ปัดลง
        // > .5 ปัดขึ้น
        System.out.println(Math.rint(number));

        // >= .5 ปัดลง
        // <= .4 ปัดขึ้น
        System.out.println(Math.round(number));

        // หารากที่ 2
        System.out.println("หารากที่ 2 ของ 9 "+Math.sqrt(9));
        System.out.println("หารากที่ 2 ของ 9 " + Math.sqrt(25));

        //หาค่ายกกำลัง
        System.out.println(5*5*5*5);
        System.out.println(Math.pow(5,4));
    }
}
