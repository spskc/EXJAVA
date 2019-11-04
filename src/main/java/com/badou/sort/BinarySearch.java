package com.badou.sort;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {


        int[] al = new int[10];

        for (int i = 0; i < 10; i++) {
            al[i] = i*2;
        }
        System.out.println(Arrays.toString(al));

        System.out.println(binarySearch(al,6));

    }

    /*
         有序，二分查找
     */
    public static int binarySearch(int[] al,int t){
        int low = 0;
        int mid;
        int high = al.length -1;
        while(low<=high){
            mid = (low+high)/2;
            if(al[mid]<t){
                low = mid+1;
            }else if(al[mid]>t){
                high = mid -1;
            }else{
                return mid;
            }

        }

        return -1;

    }

    /**
     * 快排
     */
    public static int quickSort(int[] al,int t){

        return -1;

    }


}
