public class ArrayMemberCount {
    public static void main(String[] args) {
        //การสร้าง Array
        //แบบกำหนดสมาชิก
        int []number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
        System.out.println(number.length);
        boolean[] status = {true, false, true, false};
        System.out.println(status[1]);
        String[] fruits = {"มะละกอ", "มะม่วง", "แตงโม"};
        fruits[2] = "ส้ม";
        System.out.println(fruits[2]);
    }
}
