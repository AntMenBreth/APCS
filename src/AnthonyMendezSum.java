import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class AnthonyMendezSum {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input=new Scanner(new File("sum.txt"));
        //Creates a scanner called input that stores the txt file so I can traverse it
        int hold=0;
        //As long as input has more data it will continue calculations
        int temp=0;
        int[] array=new int[10];
        while(input.hasNextLine()){
            System.out.println();
            //scanline holds one line of input so that I can add the ints of that line
            Scanner scanline=new Scanner(input.nextLine());
            hold=0;
            while(scanline.hasNext()){
                hold=scanline.nextInt();
                System.out.print(hold);
                 if(temp==0) {
                     temp = hold;
                 }
                 temp+=hold;
                if(scanline.hasNext()==false){
                    System.out.println(" +");
                }
                else{
                    System.out.println(" = "+temp);
                }
            }

        }



    }
    //Takes the
    public static void calc(int add,int[] array){
        String s=Integer.toString(add);
        for(int i=0;i<s.length();i++){
            array[array.length-1-i]=s.charAt(s.length()-i);
        }
        for(int i=array.length;i>0;i++){
            if(array[i-1]>9){
                String temp=Integer.toString(array[i-1]);

            }
        }


    }
}
