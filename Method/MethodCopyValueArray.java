public class MethodCopyValueArray {
    public static void main(String[] args) {
        int[] numberA = { 10, 20, 30, 60, 70 };
        int[] numberB = {};
        displayArray(numberA);
        displayArray(numberB);
        //หลัง copy ค่า
        numberB = copyArray(numberA);
        displayArray(numberB);
    }

    // แสดงค่า array
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

    // Copy Array
    static int[] copyArray (int[] a){
        // โยน Array A = 6 Array ใหม่ = 6 ช่องว่าง
        int[] newArr = new int[a.length];
        for(int i = 0; i<a.length; i++){
            newArr[i] = a[i];
        }
        return newArr;
    }
}
