public class MethodSwapValueArray {
    public static void main(String[] args) {
        int[] numberA = {10, 20, 30, 60, 70};
        swapElement(numberA, 0, 2);
        displayArray(numberA);
    }
    //แสดงค่า array
    static void displayArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    //สลับค่า array
    static void swapElement(int[] a, int x, int y){
        //ตำแหน่งเริ่มต้น
        //ตำแหน่งปลายทาง
        // จัดเก็บตำแหน่งชั่วคราว
        // 10, 20, 30
        int temp = a[x]; //10
        a[x] = a[y]; //3
        a[y] = temp;
        
    }
}
