public class MethodInputArray {
    public static void main(String[] args) {
        int[] numberA = {10, 20, 30, 40, 50, 60};
        intArray(numberA);

        int[] numberB = {-50, -20, -30, 100, 50};
        intArray(numberB);

        int[] numberC = {100, 200};
        intArray(numberC);

        double [] price = {300.99, 150.15, 400.15, 50};
        doubleArray(price);
    }

    //แสดงผลตัวเลขใน Array ที่ส่งเข้ามาทำงานในเมธอด
    static void intArray(int[] arr){
        System.out.print("{");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static void doubleArray(double[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
