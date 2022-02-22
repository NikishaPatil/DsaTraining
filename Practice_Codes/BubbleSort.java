public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 7, 2, 1};
        sort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        sort(arr,n-1);
    }
}


