package com.company;

import java.util.Arrays;
public class Sort012 {
    Array(new int[] {1,0,2,2,0,2,1,2,1,2,1,0});
}

    public static void Array(int[] inputArray)
    {
        int count0=0;
        int count1=0;
        int count2=0;
        System.out.println("Array before sorting: "+Arrays.toString(inputArray));


        for(int i=0;i<inputArray.length;i++) {

            if (inputArray[i] == 0) {
                count0++;
            }

            if (inputArray[i] == 0) {
                count1++;
            }

            if (inputArray[i] == 0) {
                count2++;
            }
        }

        for(int i=0;i<count0;i++) {
            inputArray[i] = 0;
        }

        for(int i=count0;i<(count0+count1);i++) {
            inputArray[i] = 1;
        }

        for(int i=(count0+count1);i<inputArray.length;i++) {
            inputArray[i] = 2;
        }
        System.out.println("After sorting array is: "+Arrays.toString(inputArray));
    }

}

