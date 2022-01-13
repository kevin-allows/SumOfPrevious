package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        int sumOfTwoPrevious = 0;
        boolean[] arrayBoolean = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            sumOfTwoPrevious = array[i-2] + array[i-1];
            if (array[i]==sumOfTwoPrevious)
                    arrayBoolean[i]=true;
        }
        return arrayBoolean;
    }
}



        /*else if (i == (array.length-1)){
                sumOfPrevious = sumOfPrevious + array[i];
                arrayBoolean[i] = true;*/
/*
        boolean[] arrayBoolean = new boolean[array.length];
        for (int i=0; i<array.length; i++){
            sumOfPrevious = sumOfPrevious + array[i];
            if (i==0 || i==1){
                arrayBoolean[i] = false;
            }
            else if (i>1){
                if (array[i]==sumOfPrevious)
                    arrayBoolean[i]=true;

            }
        }return arrayBoolean;
        */