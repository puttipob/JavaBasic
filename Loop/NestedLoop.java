public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("=================== for Loop ===================");
        //for Loop
        // loop นอก
        for(int i = 1; i <= 3;i++){
            System.out.println("Loop Outside = " + i);
            // loop ใน
            for(int j = 1; j <= 5; j++){
                System.out.println("Loop Inside = " + (i+"."+j));
            }
        }
        System.out.println("=================== while loop ===================");
        //while loop
        //loop นอก
        int i = 1, j = 1;
        while(i<=3){
            System.out.println("Loop Outside = " + i);
            j = 1;
            while(j<=5){
                System.out.println("Loop Inside = " + (i + "." + j));
                j++;//6
            }
            i++;//2
        }

    }
}
