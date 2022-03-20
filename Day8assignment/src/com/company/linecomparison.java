package com.company;

public class linecomparison {
    public static void main(String args[]){
        int[] line1PointA = new int[2];
        int[] line1PointB = new int[2];
        int[] line2PointA = new int[2];
        int[] line2PointB = new int[2];
        line1PointA = line.getCoOrdinates(line1PointA);
        line1PointB = line.getCoOrdinates(line1PointB);
        line2PointA = line.getCoOrdinates(line2PointA);
        line2PointB = line.getCoOrdinates(line2PointB);
        Double line1Length = line.calculateLength(line1PointA[0] , line1PointA[1] , line1PointB[0] , line1PointB[1]);
        Double line2Length = line.calculateLength(line2PointA[0] , line2PointA[1] , line2PointB[0] , line2PointB[1]);
        if (line1Length.equals(line2Length))
            System.out.println("line1 equals to line2 according to equals method");
        else
            System.out.println("line1 not eequals to line2 according to equals method");
        int compare = line1Length.compareTo(line2Length);
        if (compare < 0)
            System.out.println("line1 is less than line2 according to compare method");
        else if (compare > 0)
            System.out.println("line1 is greater than line2 according to compare method");
        else
            System.out.println("line1 is equal to line2 according to compare method");
    }


}
