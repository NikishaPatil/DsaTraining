
package com.company;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1={6,3,2,5,11,68,22};
        System.out.println("Array before Selection Sort");
        for(int i :arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionsort(arr1);

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");

        }
    }

    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;

                }
            }
            int smallerNum=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNum;
        }
    }
}


