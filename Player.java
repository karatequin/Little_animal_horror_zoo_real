import java.util.Scanner;

public class Player{
   boolean isActive;
   
   public Player(boolean isActive) {
      this.isActive = true;
   }

   public void newMovePlayer(){
      System.out.println("Type Up/Down/Left/Right to move in that direction: ");
      Scanner scanner = new Scanner(System.in);
      String moveDirection = scanner.nextLine();
      System.out.println("Direction chosen is: " + moveDirection);
   }

}