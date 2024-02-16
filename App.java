/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilelooptriangle;

/**
 *
 * @author Hohm
 */
public class App {

    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
