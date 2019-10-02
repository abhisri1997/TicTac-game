/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTac;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abhisri1997
 */
class GameToss {

    public String x, y;

    public void inputName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name Player 1:");
        String Player1 = input.nextLine();
        System.out.println("Enter your name Player 2:");
        String Player2 = input.nextLine();
        x = Player1;
        y = Player2;
    }

    public void Toss() {
        Random rand = new Random();
        int max = 1, min = 0;
        int rand1 = rand.nextInt((max - min) + 1) + min;
        //int rand1= (int)Math.random();
        Scanner input = new Scanner(System.in);
        System.out.println(x + " " + "Choose either Heads or Tails");
        String answer = input.nextLine();
        System.out.println(rand1);
        if (rand1 == 0 && answer.equals("heads")) {
            System.out.println(x + " choose Heads and " + "won the toss");
        } else if (rand1 == 1 && answer.equals("tails")) {
            System.out.println(x + " chose Tails and " + "won the toss");
        } else if (rand1 == 0 && answer.equals("tails")) {
            System.out.println(x + " choose Tails and " + "lost the toss");
        } else if (rand1 == 1 && answer.equals("heads")) {
            System.out.println(x + " choose Heads and " + "lost the toss");
        }
    }

    public void Choose() {
        System.out.println(x + " " + "Choose between 'X' or 'O' ");
    }
}

