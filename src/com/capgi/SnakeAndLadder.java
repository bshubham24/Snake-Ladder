package com.capgi;

public class SnakeAndLadder {
      public static void main(String[] args) {
		//SINGLE PLAYER
    	  final int START = 0;
    	  int dice=0;
    	  int Current = 0;
    	  
    	  
    	  dice = (int)Math.floor(Math.random()*10)%6;
    	  dice++;
    	  
    	  int options;
    	  while(Current!=100){
    	  options = (int)Math.floor(Math.random()*10)%3;
    	  final int NO_PLAY = 0;
    	  final int SNAKE = 1;
    	  final int LADDER =2;
    	 
    	  
    	  
    	  switch(options) {
   
    	      case NO_PLAY:
    		       break;
    		   
    	      case SNAKE:
    	    	  Current = Current-dice;
    	    	  if(Current<START) {
    	    		  Current= 0;
    	    	  }
    	    	  break;
    	    	  
    	      case LADDER:
    	    	  
    	    	  Current = Current + dice;
    	    	  if(Current>100) {
    	    		  Current = Current - dice;
    	    		  
    	    	  }
    	    	  
    	    	  break;
    		       
    	  
    		
    	  
    	  }
    
    	  }
    	  System.out.println(Current);
    	  
      }
	}

