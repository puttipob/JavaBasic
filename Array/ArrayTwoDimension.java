public class ArrayTwoDimension {
    public static void main(String[] args) {
        //Array 2 มิติ
        String [][] products = {
            {"เก้าอี้", "โต๊ะ", "โคมไฟ"},
            {"คีย์บอร์ด", "เมาส์", "แป้นพิมพ์"},
            {"ลิปติก", "โรลออน", "ครีม"}
        };
        //products[เลขแถว][เลขคอลัมน์]
        System.out.println("Before = "+products[1][2]);
        products[1][2] = "จอมอนิเตอร์";
        System.out.println("After = " + products[1][2]);
    }
}
