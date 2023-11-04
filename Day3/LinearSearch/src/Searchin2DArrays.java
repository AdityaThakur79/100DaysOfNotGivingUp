import java.util.Arrays;

public class Searchin2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {5,23,25},
                {31,18,23},
                {13,25,16}
        };

        int target = 31;
        int[] ans = search(arr,target); //format of return {row.col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target)
    {
        for(int row = 0;row<arr.length;row++)
        {
            for(int col = 0;col<arr[row].length;col++)
            {
                if(arr[row][col] == target)
                {
                  return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
