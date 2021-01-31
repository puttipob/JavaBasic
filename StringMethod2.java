public class StringMethod2 {
    public static void main(String[] args) {
        //เปลี่ยนข้อความ Replace
        String message = "Happy New Year 1992 | Happy Birath Day 1992";
        System.out.println("Before = " + message);
        message = message.replace("1992","2021");
        System.out.println("After = " + message);
        message = message.replaceFirst("2021", "1992");
        System.out.println("After = " + message);

        //String => Array ต้องใช้สัญญษลักษณ์
        String data = "มะม่วง,มะยม,ขนุน,น้อยหน่า";
        String[] fruit = data.split(",");
        System.out.println(fruit[3]);

        // =============================================

        String name = "Puttipob Noracharoen";

        // subString ตัดข้อความ(เริ่มต้น 0, จุดสุดท้าย - 1);
        String word = name.substring(0, 8);
        System.out.println(word);
        String words = word.substring(1);
        System.out.println(words);

        // แปลง String เป็น Character
        char[] alphabet = name.toCharArray();
        System.out.println(alphabet[0]);

        // แปลง Character เป็น String
        char[] fullName = {'P', 'u', 't', 't', 'i', 'p', 'o', 'b'};
        String resultFullName = String.copyValueOf(fullName);
        System.out.println(resultFullName);

        // กรอง String ให้ลบค่าว่างออกไป
        String trimName = "              Puttipob            ";
        System.out.println(trimName.length());
        System.out.println(trimName);
        trimName = trimName.trim();
        System.out.println(trimName.length());
        System.out.println(trimName);

        //แปลงจาดตัวพิมพ์เล็กไปตัวพิมพ์ใหญ่
        String upperName = "puttipob";
        System.out.println(upperName.toUpperCase());

        // แปลงจาดตัวพิมพ์ใหญ่ไปตัวพิมพ์เล็ก
        String lowerName = "PUTTIPOB";
        System.out.println(lowerName.toLowerCase());

        //แปลงตัวเลขเป็น String
        int number = 100;
        double number2 = 100.23;
        String resultNumber = String.valueOf(number);
        System.out.println(resultNumber);
        String resultNumber2 = String.valueOf(number2);
        System.out.println(resultNumber2);

    }
}
