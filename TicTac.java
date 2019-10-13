package TicTac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * @author abhisri1997
 *  TicTac Game
 * __X_|__O_|__X_
 * __O_|__X_|__O_
 *   X | O | X
 */
public class TicTac {

    public static void main(String[] args) {
        Welcome.greet();
        GameToss start = new GameToss();
        start.inputName();
        Welcome.greetPlayer(start.x, start.y);
        start.Toss();
    }
}
