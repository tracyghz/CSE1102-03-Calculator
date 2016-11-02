import java.util.Scanner;

// The Calculator project  Huizhong Gao
// Jan 20 2015
public class Calculator 
{
  public static void main(String[] args)
  {
	  Scanner kbd = new Scanner(System.in);
	  boolean contin = true;
	  double accumulator = 0.0;
	  double input;
	  while(contin)
	  {
	    int choice;
	    System.out.println("Accumulator = "+accumulator+"");
	    System.out.println("Please choose one of the following options:");
	    System.out.println("0) Exit");
	    System.out.println("1) Addition");
	    System.out.println("2) Subtraction");
	    System.out.println("3) Multiplication");
	    System.out.println("4) Division");
	    System.out.println("5) Square root");
	    System.out.println("6) Clear");
	    System.out.println("What is your choice? ");
	    
	    choice = kbd.nextInt();
	    
	    if (choice == 0)
	    
	      contin = false;	
	    	
	    //else   
	    
	      //System.out.println("Illegal operation: " +choice+"");	
	    	
	    else if (choice == 1)
	      
	    {
	      System.out.println("Enter a number");  //do addition
	      input = kbd.nextDouble();
	      accumulator = input+accumulator;
	    }
	    
	    else if (choice == 2)
	    {
	      System.out.println("Enter a number");  // do subtraction
	      input = kbd.nextDouble();
	      accumulator = accumulator-input;
	    
	    }
	    else if (choice == 3)
	    {
	      System.out.println("Enter a number");	// do multiplication
	      input = kbd.nextDouble();
	      accumulator = accumulator*input;
	    }  
	    else if (choice == 4)
	    {
	      System.out.println("Enter a number"); // do division
	      input = kbd.nextDouble();
	      accumulator = accumulator/input;
	    }
	    else if (choice == 5)
	    {
	     
	      accumulator = Math.sqrt(accumulator); // do squre root  
	    }
	    else if (choice == 6)
	    {
	      accumulator = 0.0;//clear
	    }
	    else
	    	
	    	System.out.println("Illegal operation:"+choice+"");
	    
	  }
  }
}