package unitTest;

//This is a way to test methods in TestDemo.java like addPositive(){}

public class AppTestingCtr {

	public static void main(String[] args) {
		
		TestDemo testDemo = new TestDemo();

		System.out.println(testDemo.addPositive(6, 898));
		System.out.println(testDemo.getRandomInt()); 
	
	} // close main


} // close AppTestingCtr
