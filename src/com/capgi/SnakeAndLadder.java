package com.capgi;

public class SnakeAndLadder {
      public static void main(String[] args) {
		//SINGLE PLAYER
    	  final int START = 0;
    	  int DiceRollPlayer1=0,DiceRollPlayer2=0;
    	  int CurrentScPlayer1 = 0, CurrentScPlayer2=0;
    	  int DiceCountPlayer1 =0, DiceCountPlayer2=0;
    	  int Options;
    	  
    	  while(CurrentScPlayer1!=100 && CurrentScPlayer2!=100) {
    		  //player1
    	  DiceRollPlayer1 = (int)Math.floor(Math.random()*10)%6;
    	  DiceRollPlayer1++;
    	  DiceCountPlayer1++;
    	  
    	  
    	  
    	  Options = (int)Math.floor(Math.random()*10)%3;
    	  final int NO_PLAY = 0;
    	  final int SNAKE = 1;
    	  final int LADDER =2;
    	 
    	  
    	  
    	  switch(Options) {
   
    	      case NO_PLAY:
    	    	  System.out.println("Position after dice roll Player1: "+CurrentScPlayer1);
    		       break;
    		   
    	      case SNAKE:
    	    	  CurrentScPlayer1 = CurrentScPlayer1 - DiceRollPlayer1;
    	    	  if(CurrentScPlayer1<START) {
    	    		  CurrentScPlayer1= 0;
    	    	  }
    	    	  System.out.println("Position after dice roll Player1: "+CurrentScPlayer1);
    	    	  break;
    	    	  
    	      case LADDER:
    	    	  
    	    	  CurrentScPlayer1 = CurrentScPlayer1 + DiceRollPlayer1;
    	    	  if(CurrentScPlayer1>100) {
    	    		  CurrentScPlayer1 = CurrentScPlayer1 - DiceRollPlayer1;
    	    		  
    	    	  }
    	    	  DiceRollPlayer1 = (int)Math.floor(Math.random()*10)%6;
    	    	  DiceRollPlayer1++;
    	    	  DiceCountPlayer1++;
    	    	  
    	    	  Options = (int)Math.floor(Math.random()*10)%3;
    	    	  switch(Options) {
    	    	   
        	      case NO_PLAY:
        	    	  System.out.println("Position after dice roll Player1: "+CurrentScPlayer1);
        		       break;
        		   
        	      case SNAKE:
        	    	  CurrentScPlayer1 = CurrentScPlayer1 - DiceRollPlayer1;
        	    	  if(CurrentScPlayer1<START) {
        	    		  CurrentScPlayer1= 0;
        	    	  }
        	    	  System.out.println("Position after dice roll Player1: "+CurrentScPlayer1);
        	    	  break;
        	    	  
        	      case LADDER:
        	    	  
        	    	  CurrentScPlayer1 = CurrentScPlayer1 + DiceRollPlayer1;
        	    	  if(CurrentScPlayer1>100) {
        	    		  CurrentScPlayer1 = CurrentScPlayer1 - DiceRollPlayer1;
        	    		  
        	    	  }
        	   
    	    	  
    	    	  System.out.println("Position after dice roll Player1: "+CurrentScPlayer1);
    	    	  
    	    	  
    	    	  break;
    		       
    	  
    		
    	  
    	  }
    
    	  }
    	  //player2
    	  DiceRollPlayer2 = (int)Math.floor(Math.random()*10)%6;
    	  DiceRollPlayer2++;
    	  DiceCountPlayer2++;
    	  
    	  
    	  
    	  Options = (int)Math.floor(Math.random()*10)%3;
    	
    	 
    	  
    	  
    	  switch(Options) {
   
    	      case NO_PLAY:
    	    	  System.out.println("Position after dice roll Player2: "+CurrentScPlayer2);
    		       break;
    		   
    	      case SNAKE:
    	    	  CurrentScPlayer2 = CurrentScPlayer2 - DiceRollPlayer2;
    	    	  if(CurrentScPlayer2<START) {
    	    		  CurrentScPlayer2= 0;
    	    	  }
    	    	  System.out.println("Position after dice roll Player2: "+CurrentScPlayer2);
    	    	  break;
    	    	  
    	      case LADDER:
    	    	  
    	    	  CurrentScPlayer2 = CurrentScPlayer2 + DiceRollPlayer2;
    	    	  if(CurrentScPlayer2>100) {
    	    		  CurrentScPlayer2 = CurrentScPlayer2 - DiceRollPlayer2;
    	    		  
    	    	  }
    	    	  DiceRollPlayer2 = (int)Math.floor(Math.random()*10)%6;
    	    	  DiceRollPlayer2++;
    	    	  DiceCountPlayer2++;
    	    	  
    	    	  Options = (int)Math.floor(Math.random()*10)%3;
    	    	  switch(Options) {
    	    	   
        	      case NO_PLAY:
        	    	  System.out.println("Position after dice roll Player2: "+CurrentScPlayer2);
        		       break;
        		   
        	      case SNAKE:
        	    	  CurrentScPlayer2 = CurrentScPlayer2 - DiceRollPlayer2;
        	    	  if(CurrentScPlayer2<START) {
        	    		  CurrentScPlayer2= 0;
        	    	  }
        	    	  System.out.println("Position after dice roll Player2: "+CurrentScPlayer2);
        	    	  break;
        	    	  
        	      case LADDER:
        	    	  
        	    	  CurrentScPlayer2 = CurrentScPlayer2 + DiceRollPlayer2;
        	    	  if(CurrentScPlayer2>100) {
        	    		  CurrentScPlayer2 = CurrentScPlayer2 - DiceRollPlayer2;
        	    		  
        	    	  }
        	   
    	    	  
    	    	  System.out.println("Position after dice roll Player2: "+CurrentScPlayer2);
    	    	  
    	    	  
    	    	  break;
    		       
    	  
    		
    	  
    	  }
    
    	  }
    	  }
    	  System.out.println("No of times dice rolled by Player1: "+DiceCountPlayer1);
    	  System.out.println("No of times dice rolled by Player2: "+DiceCountPlayer2);
    	  
    	  if(CurrentScPlayer1==100) {
    		  System.out.println("Player1 wins!!");
    	  }
    	  else if (CurrentScPlayer2==100){
    		  System.out.println("Player2 wins!!");
    	  }
    	  
    	  
      
	}
}
