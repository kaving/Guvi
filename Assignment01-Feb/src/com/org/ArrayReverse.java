/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kavinkumarganesan
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        int[] arr2 = {2, 5};
        int[] arr3 = new int[arr.length + arr2.length];
        int newsize = 0;

        for (int i = 0; i < arr.length; i++) {
            arr3[newsize++] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[newsize++] = arr2[i];
        }
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] > arr3[j]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }

}
