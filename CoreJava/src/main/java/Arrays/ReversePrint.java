package Arrays;

public class ReversePrint {
    public static void main(String[] args) {
        int[] arr = {13,55,46,78,91};
        for(int i = arr.length-1; i>=0; i--) {
            System.out.print(" "+arr[i]+" ");
        }
    }
}
