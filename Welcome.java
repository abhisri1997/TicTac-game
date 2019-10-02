/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTac;

/**
 *
 * @author abhisri1997
 */
public class Welcome {

    public static void greet() {
        System.out.println("\tTicTac Game By Abhi:");
        System.out.println("\t  __X_|__O_|__X_");
        System.out.println("\t  __O_|__X_|__O_");
        System.out.println("\t    X |  O |  X");
    }

    public static void greetPlayer(String player1, String player2) {
        System.out.println("Welcome" + " " + player1 + " and " + player2 + "\n" + "Have Fun!");

    }
}

