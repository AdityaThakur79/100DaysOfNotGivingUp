import java.util.Scanner;

public class MultidimensioalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][];
//          int[][] arr = {
//                  {1,2,3},//0th index
//                  {4,5},//1st index
//                  {6,7,8,9}//2nd index ->? arr[2] = {6,7,8,9}
//          };

          int[][] arr = new int[3][3];
          System.out.println(arr.length); //nos of rows

        //input
        for (int row = 0 ; row< arr.length;row++)
        {
           //for each column in every row
            for(int col = 0 ; col < arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }

        //output
        for (int row = 0 ; row< arr.length;row++)
        {
            //for each column in every row
            for(int col = 0 ; col < arr[row].length;col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}