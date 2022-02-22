public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        insertionsort(arr);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void insertionsort(int[] arr){
        int temp;
        int j;

        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;

            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
}
