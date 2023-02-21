//import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;

import unitTest.TestDemo;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class TestDemoTest {

	private TestDemo testDemo;
	
	static Stream<Arguments> argumentsForAddPositive() {
	
		return (Stream.of(
				arguments(2, 4, 6, false),
				arguments(2, -4, 6, true),
				arguments(0, 0, 0, true),
				arguments(44, 50, 94, false),
				arguments(8, 10, 18, false)
				)); 
	
	}
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}
	
	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, Boolean expectException) {
		
		
		if(!expectException) {

		// first method tested are both pos? next isEQ is evaluated
			assertThat(testDemo.addPositive(a,b)).isEqualTo(expected);
		}
		else {
			assertThatThrownBy(() -> testDemo.addPositive(a,b)).isInstanceOf(IllegalArgumentException.class);
		
		}
		
		

	}// close assertThatTwoPositiveNumbersAreAddedCorrectly
	
	// purpose: a test for squaring numbers
	@Test
	 void assertThatNumberSquaredIsCorrect() {
		
		// create spy on testDemo
		TestDemo mockDemo = spy(testDemo);
		
		// call random number method
		mockDemo.randomNumberSquared();
		
		// override this method's return value
		doReturn(5).when(mockDemo).getRandomInt();
		
		// assign the return value of doReturn(5)
		int fiveSquared = mockDemo.randomNumberSquared();
		
		// make an assertion of what the override statement will return
		assertThat(fiveSquared).isEqualTo(25);
	} // close assertThatNumberSquaredIsCorrect

	
} // close TestDemoTest
