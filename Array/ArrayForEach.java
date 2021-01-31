public class ArrayForEach {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = 0;
        for(int item : number){
            sum+=item;
        }
        System.out.println("ผลรวมเท่ากับ "+sum);
    }
}
