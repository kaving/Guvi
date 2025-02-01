/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author kavinkumarganesan
 */
public class PayableAmount {
    public static void main(String[] args) {
        int purchaseAmount;
         try (Scanner obj = new Scanner(System.in)) {
            purchaseAmount = obj.nextInt();
            if (purchaseAmount < 500) {
                System.out.println("No discount Applied, bill amount is " + purchaseAmount);
            } else if(purchaseAmount >= 500 && purchaseAmount < 1000) {
              purchaseAmount = purchaseAmount - (purchaseAmount * 10 / 100);
              System.out.println("10% discount Applied, bill amount is " + purchaseAmount);
            }else if(purchaseAmount >= 1000) {
              purchaseAmount = purchaseAmount - (purchaseAmount * 20 / 100);
              System.out.println("20% discount Applied, bill amount is " + purchaseAmount);
            }
         }
    }
}
