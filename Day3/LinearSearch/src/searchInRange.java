import java.util.Scanner;

//Question:Search in range
public class searchInRange {
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

                System.out.println("Enter start and end of the range");
                int start = in.nextInt();
                int end = in.nextInt();
                linearSearch(arr,target,start,end);
            }

            //search in the array: return the index if target found
            //otherwise if target not found return -1

            static void linearSearch(int[] arr,int target,int start,int end){
                if(arr.length==0){
                    System.out.println("Target not found!!!");
                }

                //run for a loop
                int index;
                for(int i = start;i<end;i++){
                    if(target == arr[i])
                    {
                        index = i;
                        System.out.println(target + " is at index " + i);
                    }

                }
                ;
            }

        }


