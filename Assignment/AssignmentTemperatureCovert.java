import java.util.Scanner;
public class AssignmentTemperatureCovert {
    //โปรแกรมแปลงอุณหภูมิ
    public static void main(String[] args) {
        // แปลง องศาเซลเซียส เป็น ฟาเรนไฮน์
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) = ");
        float fahren = kb.nextFloat();

        float cel = (fahren-32)*5/9;
        System.out.println(fahren+" ฟาเรนไฮน์ = "+ cel +" องศาเซลเซียส");


        // แปลง ฟาเรนไฮน์ เป็น องศาเซลเซียส 
        System.out.print("ป้อนอุณหภูมิ (เซลเซียส) = ");
        float cel2 = kb.nextFloat();

        float fahren2 = (cel2*9/5)+32;
        System.out.println(cel2 + " ฟาเรนไฮน์ = " + fahren2 + " องศาเซลเซียส");
    }
}
