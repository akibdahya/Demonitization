/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Demo {

    public static void Dem(int amt) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 1};
        String not = "Notes : ";
        int c = 0;

        for (int i = 0; i < notes.length; i++) {
            if (amt == 0) {
                System.out.println("exit");
                break;
            }
            c = amt / notes[i];
            if (c > 0) {
                amt = amt - (notes[i] * c);
                not = not + notes[i] + " -> " + c + ", ";
            }
        }
        System.out.println(not);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amt = sc.nextInt();
        sc.nextLine();
        Dem(amt);
    }

}
