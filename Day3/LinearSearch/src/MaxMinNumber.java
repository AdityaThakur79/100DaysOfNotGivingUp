public class MaxMinNumber {
    public static void main(String[] args) {
        int[] arr = {18,5,23,25,31,13};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
        static int max(int[] arr){
            int max = arr[0];

            for (int i=0;i<arr.length;i++)
            {
                if(max < arr[i])
                {
                    max = arr[i];
                }
            }
            return max;
        }
    }

