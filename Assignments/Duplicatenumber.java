public class Duplicatenumber {

    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5,6,7,7,2};

        System.out.println("Duplicate Elements in the array are: ");

        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

