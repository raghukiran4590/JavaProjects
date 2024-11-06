package Arrays;

public class FindValue {
    public static void main(String[] args) {
        int[] arr = {13,55,46,78,91};
        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 78)
                System.out.println("Found");
        }*/
        for(int i : arr) {
            if(i == 78)
                System.out.println("Found");
        }
    }
}
