public class ArrayForLoop {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int count = number.length; // นับจำนวนสมาชิกของ Array
        for (int i = 0; i < count; i++) {
            System.out.println("Array ตำแหน่งที่ "+i+" = "+number[i]);
        }
    }
}
