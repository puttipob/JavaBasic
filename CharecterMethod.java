public class CharecterMethod {
    public static void main(String[] args) {
        Character alphabet = new Character('1');
        char a = 'A';
        System.out.println(Character.isLetter(a)); //เช็คว่าเป็นตัวอักษรหรือไม่
        System.out.println(Character.isDigit(a));// เช็คว่าเป็นตัวเลขหรือไม่

        if(Character.isUpperCase(a)){
            System.out.println("เป็นพิมพ์ใหญ่");
        }

        if (Character.isLowerCase(a)) {
            System.out.println("เป็นพิมพ์เล็ก");
        }

        System.out.println("การแปลง char ตัวพิมพ์เล็กไปตัวพิมพ์ใหญ่ และ ตัวพิมพ์ใหญ่ไปตัวพิมพ์เล็ก ");

        char b = 'b';
        System.out.println("Before = " + b);
        char resultB = Character.toUpperCase(b);
        System.out.println("After = " + resultB);

        char c = 'C';
        System.out.println("Before = " + c);
        char resultC = Character.toLowerCase(c);
        System.out.println("After = " + resultC);
    }
}
