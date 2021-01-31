public class WhileLoop {
    public static void main(String[] args) {
        //ใช้ทำซํ้าในกรณีที่ไม่รู้จำนวนรอบ
        int count = 1;
        while(true){
            System.out.println("รอบที่ = "+count+" Hello World");
            count++; //2,3,.....10,11
            if(count>100) break;
        }
    }
}
