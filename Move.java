import java.util.Random;

public class Move{

   public void move(){
   
      Move generator = new Move();
      
      int random = generator.random(4);
      
      String moveMessage;
      switch (random) {
         case 0:  //Move up
                  if(posY != 10){
                     posY++;
                     moveMessage = "Animal has now moved up";
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
                     moveMessage = "Animal has now moved right";
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
                     moveMessage = "Animal has now moved down";
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
                     moveMessage = "Animal has now moved left";
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
      System.out.println(moveMessage+".\n Current position: ("+posX+","+posY+")");
   
   }

}