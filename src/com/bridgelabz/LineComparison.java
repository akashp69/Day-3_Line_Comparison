package com.bridgelabz;

import java.util.Scanner;

class Line1 {

    void getLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values For Line1 for calculating length of line");
        System.out.println("Enter x1 Value for Line1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 Value for Line1 ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 Value for Line1 ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 Value for Line1");
        int y2 = sc.nextInt();
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line1 is" + length1);

        System.out.println("Enter values For Line2 for calculating length of line");
        System.out.println("Enter x1 Value for Line2 ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 Value for Line2 ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 Value for Line2 ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 Value for Line2");
        y2 = sc.nextInt();
        double length2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line2 is" + length2);


        double l1=length1;
        double l2=length2;

        String s1=String.valueOf(l1);
        String s2=String.valueOf(l2);


        int c=s1.compareTo(s2);
       
        if (c==0) {
            System.out.println("lines are equal");
        }else if(c>0){
            System.out.println("line1 is less than line2");
        }
        else {
            System.out.println("line1 is greater than line2");
        }
    }
}

class Line2 extends Line1{
    void compairLines (){
        System.out.println("Comparing two lines ");

    }

}

public class LineComparison {

    public static void main(String[] args) {
    Line2 obj1 = new Line2();
    obj1.compairLines();
    obj1.getLine();

    }
}

