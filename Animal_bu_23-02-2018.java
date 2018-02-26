import java.util.Random;

public class Animal {
   private int posX, posY, oldPosX, oldPosY;
   private String name = "";
   boolean player = false;
   
   public Animal() {
   
   }
   
   public Animal(String name) {
      this.name = name;
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
   
   public void move() {
      Animal generator = new Animal();
      int random = generator.random(4);
      
      String moveMessage = "";
      
      switch (random) {
         case 0:  //Move up
                  if(posY != 10){
                     posY++;
//moveMessage = "Animal has now moved up";
                  } else {
                     if(player == true){
                        moveMessage = "Invalid move";
                     } else {
                        posY--;
                     }
                  }
                  break;
         case 1:  //Move right 
                  if(posX != 10){
                     posX++;
                     //moveMessage = "Animal has now moved right";
                  } else {
                     if(player == true){
                        moveMessage = "Invalid move";
                     } else {
                        posX--;
                     }
                  }
                  break;
         case 2:  //Move down
                  if(posY != 0){
                     posY--;
                     //moveMessage = "Animal has now moved down";
                  } else {
                     if(player == true){
                        moveMessage = "Invalid move";
                     } else {
                        posY++;
                     }
                  }
                  break;
         case 3:  //Move left
                  if(posX != 0){
                     posX--;
                     //moveMessage = "Animal has now moved left";
                  } else {
                     if(player == true){
                        moveMessage = "Invalid move";
                     } else {
                        posX++;
                     }
                  }
                  break;
         default: //Invalid move
                  moveMessage = "Invalid move";
                  break;
      }
      //System.out.println(moveMessage+".\n Current position: ("+posX+","+posY+")");
   /*   Animal generator = new Animal();
      
      int random = generator.random(2);
      if(random == 0) {
         if (posY == 0){
            oldPosY = posY;
            posY++;
         }
            
         else if (posY == 10){
           oldPosY = posY;
           posY--;
         }
         
         else {
            random = generator.random(2);
            
            if(random==0) {   
               oldPosY = posY;
               posY++;
            }
            
            else{
               oldPosY = posY;
               posY--;
            }
         }
      }
      else {
         if (posX == 0){
            oldPosX = posX;
            posX++;
         }
            
         else if (posX == 10){
           oldPosX = posX;
           posX--;
         }
         else {
            random = generator.random(2);
            if(random==0) {   
               oldPosX = posX;
               posX++;
            }
            else{
               oldPosX = posX;
               posX--;
            }
         }      
      }*/
   }
}