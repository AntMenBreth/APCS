import java.util.Arrays;

public class RandomFromHat {
    public static void main(String[] args){
        int[] matchup=new int[8];
        //Both for testing whether the numbers were used in the array
        int temp=0;
        int tempp=0;
        //For telling the array where different numbers should be placed
        int x=0;
        //For Calculating when the program should end
        int fin=0;

        //While loop containing the main code
        while (fin!=4){
            temp=calc();
            tempp=calc();
            //Checks if Either Number Was Used prior
            if (tf(matchup,temp)==false){

            }
            else if(tf(matchup,tempp)==false){

            }
            //Checks whether the numbers are the same
            else if(temp==tempp){

            }
            //Sets up the array for the next set of teams & prints the teams versing each other
            else{
                matchup[x]=temp;
                matchup[(x+1)]=tempp;
                x=x+2;
                System.out.println(temp+" vs "+tempp);
                fin++;
            }
        }
    }
    //Simply Calculates a Number Between 1-8
    public static int calc(){
        int randomSize=(int)(Math.random()*8)+1;
        return randomSize;
    }
    //Scans Array for numbers already given a place
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
