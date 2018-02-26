import java.util.Scanner;

public class Game {
   public static void main(String[] args) {
      // Create rabbit object in Animal
      Animal snake = new Animal("snake", true);
      // Create snake object in Animal
      Animal rabbit = new Animal("rabbit", false);

      snake.setPos(9,9);
      rabbit.setPos(1,1);
      
      while(snake.getPosX() != rabbit.getPosX() || snake.getPosY() != rabbit.getPosY()) {
         rabbit.move();
         rabbit.printPos();
     
         snake.move();
         snake.printPos();
         System.out.println("");
      }
      System.out.println(rabbit.beg());
      System.out.println(snake.eat());
   }
}

