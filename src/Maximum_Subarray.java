import java.util.Scanner;

public class Maximum_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int iterator = 0; iterator < size; iterator++) {
            array[iterator] = scanner.nextInt();
        }
        int max_sum= scanner.nextInt();
        System.out.println(max_subarray(array, max_sum));
    }

    static int max_subarray(int[] array, int max_sum) {
        int maxsubarray = 0;
        for (int iterator1 = 0 ; iterator1 < array.length; iterator1++){
            for (int iterator2 = iterator1 ; iterator2 < array.length ; iterator2++){
                int subarray = 0;
                for (int iterator3 = iterator1 ; iterator3 <= iterator2 ; iterator3++){
                    subarray += array[iterator3];
                    if (subarray <= max_sum){
                        maxsubarray = Math.max(maxsubarray, subarray);
                    }
                }
            }
        }
        return maxsubarray;
    }
}
