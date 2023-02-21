package unitTest;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			int sum = a + b;
			return sum;
		}
		
		else {throw new IllegalArgumentException ("Both numbers must be positive."); }						
 
	} // addPositive

	public int randomNumberSquared() {
		
		return getRandomInt() * getRandomInt();
		
	} // close randomNumberSquared

	public int getRandomInt() {
		
		Random random = new Random();
		
		return random.nextInt(10) + 1;
		
	} // close getRandomInt

	// creating this method created a lot of red lines in TDT.java
//	public void randomNumberSquare() {
//		// TODO Auto-generated method stub
//		
//	}
	
} // close TestDemo

