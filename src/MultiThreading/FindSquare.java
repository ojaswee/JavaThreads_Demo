//package MultiThreading;
//import java.util.*; //for random 

//Runnable interface we implement Runnable because 
//Thread class, our class cannot extend any other class because Java doesn’t 
//support multiple inheritance. But, if we implement the Runnable interface, 
//our class can still extend other base classes.

package MultiThreading;
public class FindSquare implements Runnable{

//whenever we start a code this 
	   //int numArr[] = new int [50];
	   public int num; 
	   public FindSquare(int num) {
		   this.num = num;
		   System.out.printf("Initiated %d\n",num);
	   }

	//Runnable needs to have a run method
	public void run() {
		  try{
			  int sq = num*num;
			  System.out.printf("Square of %d is %d\n", num, sq);
			  
	        }catch(Exception e){
	        	System.err.println("Error in Start_thread");
	            System.exit(1);
	        }
	}
}
