/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citystrings;

import java.util.Scanner;

/**
 *
 * @author Diandre
 */
public class CityStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your favorite city? ");
        String input = keyboard.nextLine();
        int cityLength = input.length();
        System.out.println(cityLength);
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());

    }

}
