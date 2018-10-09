import java.util.Arrays;
import java.util.Scanner;

public class RandomFromHatV2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many teams?");
        int numbteams=scan.nextInt();
        int[] matchup=new int[numbteams];
        int temp=0;
        int tempp=0;
        int x=0;
        int fin=0;


        while (fin!=numbteams){
            temp=calc(numbteams);
            tempp=calc(numbteams);
            if (tf(matchup,temp)==false){

            }
            else if(tf(matchup,tempp)==false){

            }
            else if(temp==tempp){

            }
            else{
                matchup[x]=temp;
                matchup[(x+1)]=tempp;
                x=x+2;
                System.out.println(temp+" vs "+tempp);
                fin++;
                System.out.println(Arrays.toString(matchup));
            }
        }
    }
    public static int calc(int numbteams){
        int randomSize=(int)(Math.random()*(numbteams-1)+1)+1;
        return randomSize;
    }
    public static boolean tf(int[] array, int temp){
        int x=0;
        for (int i=0;i<array.length;i++){
            if(temp==array[i]){
                x=1;
            }
        }
        if(x==0) {
            return true;
        }
        else{
            return false;
        }
    }
}
