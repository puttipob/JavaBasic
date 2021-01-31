public class StringMethod {
    public static void main(String[] args) {
        // นิยาม String
        String fullName = "นายพุฒิภพ นรเจริญ";
        String name = "Puttipob ";
        String Name = "puttipob ";
        String surname = "Noracharoen ";
        String city = new String("Bangkok");

        // Concatenation => ต่อ String
        String result = name+city;
        System.out.println(result.concat(".com"));

        // หาความยาว String
        int countName = name.length();
        int countCity = city.length();
        System.out.println(countName);
        System.out.println(countCity);

        // หาว่าในตำแหน่ง String คือตัวอักษรอะไร
        System.out.println(name.charAt(3));

        // เปรียบเทียบ String
        boolean resultString =  name.equals(surname);
        System.out.println(resultString);

        boolean resultString2 = name.equalsIgnoreCase(Name); // ตัวพิมพ์เล็กใหญ่ไม่มีผล
        System.out.println(resultString2);


        // เช็คว่าตัวแปรเริ่มต้นขึ้นว่าค่าที่ส่งไปหรือไหม
        boolean resultFullName = fullName.startsWith("นาย"); //ค่าด้านหน้า
        System.out.println(resultFullName);

        boolean resultFullName2 = fullName.endsWith("เจริญ");// ค่าด้านหลัง
        System.out.println(resultFullName2);

        //ค้นหาตำแหน่ง index ใน String
        System.out.println(fullName.indexOf("ภพ"));
    }
}
