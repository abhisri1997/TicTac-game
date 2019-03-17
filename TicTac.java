import java.util.*;
/*
TicTac Game
__X_|__O_|__X_
__O_|__X_|__O_
  X |  O |  X
*/
public class TicTac{
  public static void main(String[] args) {
    Welcome.greet();
    Game start = new Game();
    start.inputName();
    Welcome.greetPlayer();
    start.show();
  }
}
class Welcome{
  public static void greet(){
    System.out.println("\tTicTac Game By Abhi:");
    System.out.println("\t  __X_|__O_|__X_");
    System.out.println("\t  __O_|__X_|__O_");
    System.out.println("\t    X |  O |  X");
  }
  public static void greetPlayer(){
    Game call = new Game();
    System.out.println("Welcome " + " " + call.x + " and " + call.y + "\n" + "Have Fun!");
  }
}
class Game{
  public String x,y;
  public void inputName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name Player 1:");
    String Player1 = input.nextLine();
    System.out.println("Enter your name Player 2:");
    String Player2 = input.nextLine();
    x = Player1;
    y = Player2;
  }
  public void show(){
    System.out.println("Hi " + " " + x + " and " + y);
  }
}
