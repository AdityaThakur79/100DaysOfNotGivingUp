import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element to be searched");
        int target = in.nextInt();

      linearSearch(arr,target);
    }

    //search in the array: return the index if target found
    //otherwise if target not found return -1

    static void linearSearch(int[] arr,int target){
        if(arr.length==0){
            System.out.println("Target not found!!!");
        }

        //run for a loop
        int index;
        for(int i = 0;i<arr.length;i++){
            if(target == arr[i])
            {
                index = i;
                System.out.println(target + " is at index " + i);
            }

        }
    ;
    }

}
