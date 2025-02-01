/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author kavinkumarganesan
 */
public class SmallestAmongThree {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();    
            if (a < b && a < c) {
                System.out.println("Smallest number is " + a);
            } else if (b < a && b < c) {
                System.out.println("Smallest number is " + b);
            } else {
                System.out.println("Smallest number is " + c);
            }
        }
    }
}
