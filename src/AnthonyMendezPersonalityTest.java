import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class AnthonyMendezPersonalityTest {
    public static void main(String[] args) throws FileNotFoundException{
        int[] a=new int[70];
        Scanner input=new Scanner(new File("personality.txt"));
        double pickline=0;
        String s="";
        while(input.hasNextLine()) {
            s = input.nextLine();
            if(70<=s.length()){
                for(int i=0;i<70;i++){
                    a[i]=s.charAt(i);
                }
                printer(a);
            }
            else{
                System.out.println(s+":");
            }
        }
    }
    public static void printer(int[] a){
        int count=0;
        int A=0;
        int B=0;
        //How many introverts
        int first=0;
        //How many iNtuition
        int second=0;
        //How many feeling
        int third=0;
        //How many perceiving
        int fourth=0;
        while(count!=70){

            if(a[count]==66){
                B++;
                if(count%7==0||count==1){
                    first++;
                }
                else if(count==2||count==3||count==9||count==10||count==16||count==17||count==23||count==24||count==30||count==31||count==37||
                     count==38||count==44||count==45||count==51||count==52||count==58||count==59||count==65||count==66);{
                         second++;
                }
                 else if(count==4||count==5||count==11||count==12||count==18||count==19||count==25||count==26||count==32||count==33||count==39||
                        count==40||count==46||count==47||count==53||count==54||count==60||count==61||count==67||count==68);{
                    second++;
                }
                else{
                    fourth++;
                }

                }

            else{
            }
            count++;
        }
        System.out.println(A+"A-"+B+"B ");
        fourth*=10;
        first*=10;
        second*=10;
        third*=10;
        System.out.print("["+first+"%, "+second+"%, "+third+"%, "+fourth+"%]");



        System.out.println();
    }

}
