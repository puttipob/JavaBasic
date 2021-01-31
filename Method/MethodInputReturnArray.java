public class MethodInputReturnArray {
    public static void main(String[] args) {
        int[] numberA = { 10, 20, 30, 40, 50, 60 };
        System.out.println("ค่าที่มากที่สุดของ A = " + findMaxInArray(numberA) + " ตำแหน่งที่ = " + findMaxIndex(numberA));
        System.out.println("ค่าที่น้อยที่สุดของ A = " + findMinInArray(numberA) + " ตำแหน่งที่ = " + findMinIndex(numberA));
        int[] numberB = { -50, -20, -30, 100, 50 };
        System.out.println("ค่าที่มากที่สุดของ B = " + findMaxInArray(numberB) + " ตำแหน่งที่ = " + findMaxIndex(numberB));
        System.out.println("ค่าที่น้อยที่สุดของ A = " + findMinInArray(numberB) + " ตำแหน่งที่ = " + findMinIndex(numberB));
        int[] numberC = { 100, 200, -500, 1000 };
        System.out.println("ค่าที่มากที่สุดของ C = " + findMaxInArray(numberC) + " ตำแหน่งที่ = " + findMaxIndex(numberC));
        System.out.println("ค่าที่น้อยที่สุดของ A = " + findMinInArray(numberC) + " ตำแหน่งที่ = " + findMinIndex(numberC));
    }

    // แสดงผลตัวเลขใน Array ที่ส่งเข้ามาทำงานในเมธอด
    static void intArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static int findMaxInArray(int[] arr){
        //ค้นหาค่ามากที่สุดใน Array
        //ได้ค่ามากที่สุด
        int maxValue = arr[0]; //เก็บค่าสูงสุดเอาไว้เป็นค่าเริ่มต้น
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int findMinInArray(int[] arr) {
        int minValue = arr[0]; // เก็บค่าสูงสุดเอาไว้เป็นค่าเริ่มต้น
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static int findMaxIndex(int[] arr){
        int maxIndex = 0;//เก็บตำแหน่ง index สมาชิกที่มีค่ามตัวเลขมากที่สุดใน arr
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMinIndex(int[] arr) {
        int minIndex = 0;// เก็บตำแหน่ง index สมาชิกที่มีค่ามตัวเลขน้อยที่สุดใน arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
