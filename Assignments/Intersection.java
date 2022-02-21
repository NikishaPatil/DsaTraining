public class Intersection {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 4, 5, 6};
        int[] Arr2 = {4, 9, 13, 15, 16, 17};
        findIntersection(Arr1, Arr2);

    }
    public static void findIntersection(int[] Arr1,int[] Arr2)
    {
        int i = 0;
        int j = 0;

        while (i < Arr1.length && j<Arr2.length) {
            if (Arr1[i] < Arr2[j]) {
                i++;
            } else if (Arr1[i] > Arr2[j]) {
                j++;
            } else {
                System.out.println(Arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}

}
