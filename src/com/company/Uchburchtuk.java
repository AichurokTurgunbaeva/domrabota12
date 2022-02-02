package com.company;

public class Uchburchtuk {
    int a;
    int b;
    int c;

    void area() {
        int s = (a+b+c)/2;
        int area1 = s*((s-a)*(s-b)*(s-c));
        double area = Math.sqrt(area1);
        System.out.println(area);
    }


}
