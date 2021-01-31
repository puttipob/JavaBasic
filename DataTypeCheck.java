public class DataTypeCheck {
    public static void main(String[] args) {

        // เช็คชนิดข้อมูล
        Integer a = 10;
        double b = 10.23;
        String c = "Hello World";
        boolean d = true;
        char e = 'A';
        float f = 10.23f;

        // เป็น (true) / ไม่เป็น (false)

        boolean result = a instanceof Integer;
        System.out.println(result);
    }
}
