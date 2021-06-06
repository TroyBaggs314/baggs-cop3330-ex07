/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */
package org.example;
import java.util.Scanner;

class Room
{
    int l;
    int w;
}

public class exercise07
{
    public static void main(String[] args)
    {
        final double conv =  0.09290304;
        Room r = new Room();
        r = inputs(r);
        int dim = r.l * r.w;
        double dimMeters = (dim * 1.0) * conv;
        System.out.println("You entered dimensions of " + r.l + " feet by " + r.w + " feet. \nThe area is \n" + dim + " square feet\n" + dimMeters + " square meters");
    }

    public static Room inputs(Room r)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        r.l = sc.nextInt();
        System.out.println("What is the width of the room in feet? ");
        r.w = sc.nextInt();
        return r;
    }
}
