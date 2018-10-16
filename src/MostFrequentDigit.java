import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("What do you want me to galculate?");
        int numb=scan.nextInt();
        alg1(numb);
    }
    public static int alg1(int n){
        int[] tboard=new int[10];
        int answ=0;
        int thelp=0;
        int use=0;
        //Extract each digit from n.
        //create an array of integers ti tally the digits.
        //Traverse the array to locate the largest value.
        //It's not the largest value in the array we're interested in, it's the index of the largest value
        //we're looking for.
        while(n>0){
            thelp=n%10;
            n=n/10;
            tboard[thelp]=tboard[thelp]+1;
        }
        for(int i=0;i<tboard.length;i++){
            if(use<tboard[i]){
                answ=i;
                use=tboard[i];
            }
        }
        System.out.println("The most common digit is "+answ);
        return answ;
    }

}
