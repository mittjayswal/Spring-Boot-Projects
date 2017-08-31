import static org.junit.Assert.*;

import org.junit.Test;

import com.mitt.test.MyMath;

public class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Test
	public void sum_with3numbers() {
		
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	@Test
	public void sum_with1numbers() {
		
		assertEquals(3, myMath.sum(new int[] {3}));
	}
	
}
