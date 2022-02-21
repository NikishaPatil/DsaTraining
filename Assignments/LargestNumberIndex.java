public class LargestNumberIndex {
    public static void main(String[] args) {
        int a[] = new int[] {12,44,23,56,78,13};

        int max=a[0];
        int index=a[0];

        for(int i=0; i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
                index=i;
            }
        }
        System.out.println("Index position of Maximum value in an array is: "+index);
    }
}

