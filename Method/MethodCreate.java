public class MethodCreate {
    public static void main(String[] args) {
        //การเรียกใช้ 
        display();
        openVideo();
        playVideo();
        pauseVideo();
        exitProgram();
    }
    //การสร้างเมธอด
    static void display(){
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("Hello World");
    }
    
    static void openVideo() {
        //คำสั่งเปิดไฟล์วิดิโอ
        System.out.println("เปิดไฟล์ Video");
    }
    
    static void playVideo() {
        // คำสั่งเล่นไฟล์วิดิโอ
        System.out.println("เล่น Video");
    }

    static void pauseVideo() {
        // คำสั่งหยุดไฟล์วิดิโอ
        System.out.println("หยุด Video");
    }

    static void exitProgram() {
        // คำสั่งหยุดไฟล์วิดิโอ
        System.out.println("Clear Memory");
        System.out.println("ออกจากโปรแกรม");
    }
}
