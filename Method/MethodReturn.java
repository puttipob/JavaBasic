public class MethodReturn {
    public static void main(String[] args) {
        connectServer(300);
    }
    public static void connectServer(int ping){
        System.out.println("Ping "+ ping);
        // return ถ้าเป็นจริงจะกระโดดออกจาก method เลย
        if(ping>100){
            return;
        }
        System.out.println("Connect Server");
    }
}
