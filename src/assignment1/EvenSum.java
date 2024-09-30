package assignment1;

public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = findEvenSum(arr);
        System.out.println(sum);
    }
    public static int findEvenSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
