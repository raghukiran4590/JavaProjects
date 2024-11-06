package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {13,55,46,78,91};
        int sum = 0;
        for(int i : arr) {
           sum += i;
        }
        System.out.println("Sum of all the values in an Array : "+sum);
    }

}
