package com.company;

import java.util.Scanner;

public class line {
    public static int[] getCoOrdinates(int[] array){
        Scanner get = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("enter coordinate " + i + " of your point");
            array[i] = get.nextInt();
        }
        return array;
    }
    public static double calculateLength(int x1, int y1, int x2, int y2){
        double length = Math.sqrt(Math.pow(x2-x1 , 2) + Math.pow(y2-y1 , 2));
        return length;
    }
}
