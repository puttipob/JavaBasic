public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            // continue ข้ามรอบนั้นไป
            if(i % 2 == 0)continue;
            //หยุด loop เลย
            if (i == 9)break;
            System.out.println(i);
        }
        System.out.println("จบโปรแกรม");
    }
}
