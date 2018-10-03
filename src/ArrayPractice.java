import java.util.Arrays;
import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args){
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i +1;
        }
        System.out.println(Arrays.toString(numbers));

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        randomArray();
        JadavVers();


    }
    public static void randomArray(){
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random()*10)+1;
        }


            System.out.println(Arrays.toString(random));

        }
        public static void JadavVers(){
        int randomSize=(int)(Math.random()*10)+1;
        int[] randomArray=new int [randomSize];
        for(int i = 0; i<randomArray.length;i++){
            randomArray[i] = (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
