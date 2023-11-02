import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        System.out.println(arr[2]);

        //input using for loop of an array
//        for (int i = 0; i<arr.length;i++)
//        {
//            arr[i] =  in.nextInt();
//        }
//        for(int i = 0; i<arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }

       String[] str = new String[4];
       for(int i = 0 ; i<str.length;i++)
       {
           str[i] = in.next();
       }
        System.out.println(Arrays.toString(str));

//       modifying string value
        str[1]="Adarsh";
        System.out.println(Arrays.toString(str));
    }
}
