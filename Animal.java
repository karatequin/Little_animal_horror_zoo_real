import java.util.Random;
import java.util.Scanner;

public class Animal {
   private int posX, posY, oldPosX, oldPosY;
   private String name = "";
   boolean player = false;
   private int direction;
   
   public Animal() {
   
   }
   
   public Animal(String name, boolean player) {
      this.name = name;
      this.player = player;
      
   }  
   
   public int random(int input) {
      // creates a new random generator object
		Random generator = new Random();
      
      // Creates an integer variable called random and puts in a new random number between 0 and input number given
      int random = generator.nextInt(input);
      
      //returns the value on the random variable.
		return random;		
   }
   
   public void setPos(int posX, int posY){
      this.posX = posX;
      this.posY = posY;
   }
   
   public int getPosX() {
      return posX;
   }
   
   public int getPosY() {
      return posY;
   }
   
   public void printPos(){
      System.out.println(this.name+": I moved to ("+posX+","+posY+")");
   }
   
   public String beg() {
      return this.name+": Please don't eat me!";
   }
   public String eat() {
      return this.name+": I'm gonna eat you, muhahaha";
   }
   
   public void movePlayer(){
      System.out.println("Type Up/Down/Left/Right to move in that direction: ");
      Scanner scanner = new Scanner(System.in);
      String moveDirection = scanner.nextLine();
      System.out.println("Direction chosen is: " + moveDirection);
      switch(moveDirection) {
         case "up":
         case "Up":
         case "UP":
         case "u":
         case "U":
            direction = 0;
            break;
         case "right":
         case "Right":
         case "RIGHT":
         case "r":
         case "R":
            direction = 1;
            break;
         case "down":
         case "Down":
         case "DOWN":
         case "d":
         case "D":
            direction = 2;
            break;
         case "left":
         case "Left":
         case "LEFT":
         case "l":
         case "L":
            direction = 3;
            break;
         case "auto":
         case "Auto":
         case "AUTO":
         case "a":
         case "A":
            this.player = false;
            break;
         default: 
            System.out.println("Error");
      }
   }
   
   public void move() {
      Animal generator = new Animal();
      int random = generator.random(4);
      
      if(player == false) {
         this.direction = random;
      }
      else {
         movePlayer();
      }
      
      String moveMessage = "";
      
      switch (direction) {
         case 0:  //Move up
                  if(posY != 10){
                     posY++;
                  } 
                  else {
                     if(player == true) {
                        System.out.println("Invalid move");
                     } 
                     else {
                        posY--;
                     }
                  }
                  break;
         case 1:  //Move right 
                  if(posX != 10){
                     posX++;
                  } 
                  else {
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     else {
                        posX--;
                     }
                  }
                  break;
         case 2:  //Move down
                  if(posY != 0){
                     posY--;
                  } 
                  else {
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     else {
                        posY++;
                     }
                  }
                  break;
         case 3:  //Move left
                  if(posX != 0){
                     posX--;
                  } 
                  else {
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     else {
                        posX++;
                     }
                  }
                  break;
         default: //Invalid move
                  System.out.println("Invalid move");
                  break;
      }
   }
}