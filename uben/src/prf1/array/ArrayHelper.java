package prf1.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int [] Demo = {8,5,1,9,0,4};

        System.out.println(Arrays.toString(Demo));
        arrangeOrder(Demo);
        System.out.println(Arrays.toString(Demo));

    }

    public static void arrangeOrder(int[] array)
    {
        boolean swapped = false;
        do{
            swapped = false;
            for(int i=0; i<array.length-1; i++)
            {
                int a = array[i];
                int b = array[i+1];
                if(a > b)
                 {
                    array[i]=b;
                    array[i+1]=a;
                    swapped = true;
                }
            }
        }   while (swapped);
    }
}

