package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;
        x1=1;
        x2=2;
        y1=3;
        y2=4;
        dis = Math.sqrt(x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        System.out.println("distance" +dis);
    }
}

