
public class Union {
    public static void main(String[] args) {
        int[] Arr1 = {1, 2, 3, 4, 5, 6};
        int[] Arr2 = {4, 9, 13, 15, 16, 17};
        findUnion(Arr1, Arr2);
    }

    public static void findUnion(int[] Arr1, int[] Arr2) {
        int i = 0;
        int j = 0;

        while (i < Arr1.length && j < Arr2.length) {
            if (Arr1[i] < Arr2[j]) {
                System.out.print(Arr1[i] + " ");
                i++;
            } else if (Arr2[j] < Arr1[i]) {
                System.out.print(Arr2[j] + " ");
                j++;
            } else {
                System.out.print(Arr1[i] + " ");
                i++;
                j++;
            }
        }


        while (i < Arr1.length) {
            System.out.print(Arr1[i] + " ");
            i++;
        }

        while (j < Arr2.length) {
            System.out.print(Arr2[j] + " ");
            j++;
        }
    }
}

