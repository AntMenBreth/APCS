import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i +1;
        }
        System.out.println(Arrays.toString(numbers));

        int[] num = {1,2,3,4,5,6,7,8,9,10};


    }
}
