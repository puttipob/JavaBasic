public class MethodInputReturnData {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        int resultMax = maxNumber(10, 5);
        System.out.println("ค่าที่มากที่สุดคือ = " + resultMax);

        int resultMin = minNumber(100, 50);
        System.out.println("ค่าที่น้อยที่สุดคือ = " + resultMin);

        int resultsum = summation(resultMax, resultMin);
        System.out.println("ผลรวม = " + resultsum);
    }
    /*
    ชนิดข้อมูลที่จะส่งออกไป ชื่อเมธอด (ค่าที่สงเข้ามา){
        //การประมวลผล
        //return ชนิดข้อมูล
    }
    */

    //เปรียบเทียบตัวเลข 2 ตัว
    static int maxNumber(int a, int b){
        //การประมวลผล
        if(a==b){   
            return a;
        }else if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
    static int minNumber(int a, int b) {
        // การประมวลผล
        if (a == b) {
            return a;
        } else if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    static int summation(int x, int y) {
        int total = x + y;
        return total;
    }
}
