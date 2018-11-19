import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class AnthonyMendezPersonalityTest {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input=new Scanner(new File("personality.txt"));
        double pickline=0;
        String s="";

        while(input.hasNextLine()){
            s=input.nextLine();
            System.out.println(s);
            if(s.length()!=70){
            }
            else{
                //printer(input.nextLine());
            }
        }


    }
    public static void printer(String answ){
        int count=0;
        int A=0;
        int B=0;
        int dash=0;
        while(count!=10){
            if (answ.charAt(count) == "A") {
            }
            count++;
        }

    }
}
