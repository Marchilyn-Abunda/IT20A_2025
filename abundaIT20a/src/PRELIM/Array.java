/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author Admin
 */
public class Array {

    public static void main(String[] args) {
        ////        Declaring an Array
//
//        int[] numbers = new int[5];
//
////        Initializing
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;

// Declaring + ninitializing

int numbers[] = {1, 2, 3, 4, 5};

//System.out.println(numbers[2]);      
//        for (int i : numbers) {
//            System.out.println(i);
//        }
        numbers[4] = 6;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println( " Array length : "+ numbers.length);
    }

}
