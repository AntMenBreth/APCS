import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array={5,2,4,1,3};
        System.out.println(Arrays.toString(array));
        oliveralgo(array);
        Mach(array);


    }
    public static void oliveralgo(int[] oa){
        int[] array2=new int [oa.length];
        for(int i=array2.length-1;i>=0;i--){
            array2[i]=oa[oa.length-i-1];


        }
        System.out.println(Arrays.toString(array2));
    }
    public static void Mach(int[] oa){
        int temp;
        for(int i=0;i<oa.length/2;i++){
            temp=oa[i];
            oa[i]=oa[oa.length-i-1];
            oa[oa.length-i-1]=temp;
        }
    }

}
