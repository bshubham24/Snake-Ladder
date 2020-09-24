package com.capgi;

public class SnakeAndLadder {
      public static void main(String[] args) {
		//SINGLE PLAYER
    	  final int START = 0;
    	  int dice=0;
    	  int Current = 0;
    	  int dice_count =0;
    	  int options;
    	  
    	  while(Current!=100) {
    	  dice = (int)Math.floor(Math.random()*10)%6;
    	  dice++;
    	  dice_count++;
    	  
    	  
    	  
    	  options = (int)Math.floor(Math.random()*10)%3;
    	  final int NO_PLAY = 0;
    	  final int SNAKE = 1;
    	  final int LADDER =2;
    	 
    	  
    	  
    	  switch(options) {
   
    	      case NO_PLAY:
    	    	  System.out.println("Position after dice roll: "+Current);
    		       break;
    		   
    	      case SNAKE:
    	    	  Current = Current-dice;
    	    	  if(Current<START) {
    	    		  Current= 0;
    	    	  }
    	    	  System.out.println("Position after dice roll: "+Current);
    	    	  break;
    	    	  
    	      case LADDER:
    	    	  
    	    	  Current = Current + dice;
    	    	  if(Current>100) {
    	    		  Current = Current - dice;
    	    		  
    	    	  }
    	    	  System.out.println("Position after dice roll: "+Current);
    	    	  
    	    	  
    	    	  break;
    		       
    	  
    		
    	  
    	  }
    
    	  }
    	  System.out.println("No of times dice rolled: "+dice_count);
    	  
      }
	}

