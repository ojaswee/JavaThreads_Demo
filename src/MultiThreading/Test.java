//we can implement threading in Java in 2 ways via Thread class and Runnable interface
//1) If we use Thread class we can encounter a problem if we want to import more then one class because 
//		java does not support multiple inheritance
//2) if we use thread there are more inbuilt methods like yeild(),inturupt() etc that are not available in Runnable interface
//3) If you implement Runnable it shares same object to multiple threads, where as Thread will create unique objects for each 
//		thread

package MultiThreading;

import MultiThreading.FindSquare;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i<50; i++) {
			
			//using Runnable interface
			Thread object1 = new Thread(new FindSquare(i));
			object1.start();
			
			//using Thread class
			OddOrEven object2= new OddOrEven(i);
			object2.start();
		}
	}

}
