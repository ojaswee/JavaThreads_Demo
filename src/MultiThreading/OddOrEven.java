package MultiThreading;

public class OddOrEven extends Thread{
	public int num;

	public OddOrEven(int num) {
		this.num = num;
	}

	public void run() {
		if (num%2 !=0) {
			System.out.printf("%d is odd number\n",num);
		}
		else System.out.printf("%d is even number\n",num);
	}

}
