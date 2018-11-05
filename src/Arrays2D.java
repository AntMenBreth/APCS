public class Arrays2D {
    //Prints multiplication table of numbers 1 through 5
    public static void main(String[] args){
        int[][] table=new int[5][10];
        for(int row=0;row<table.length;row++){
            for(int col=0;col<table[row].length;col++){
                table[row][col]=(row+1)*(col+1);
                System.out.print(table[row][col]+ "\t");
            }
            System.out.println();
        }
    }
}
