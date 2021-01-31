public class MethodFindMemberArray {
    public static void main(String[] args) {
        int[] numberA = {10, 20, 30, 40, 50, 100, 200};
        System.out.println(searchElement(numberA, 200));

        String[] MAFANG = {"Microsoft", "Apple", "Facebook", "Amazon", "Netflix", "Google"};
        System.out.println(searchMAFANG(MAFANG, "Oracle"));
    }

    static int searchElement(int[] arr, int number){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    static int searchMAFANG(String[] arr, String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
