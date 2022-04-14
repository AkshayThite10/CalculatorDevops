// package calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	@Test
	    public void test_squareRoot() {
	        double a = 81.0;
	        double expectedResult = 9.0;
	        double result = App.sqroot(a);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
	@Test
	    public void test_factorial() {
	        int a = 4;
	        int expectedResult = 24;
	        int result = App.fact(a);
	        Assert.assertEquals(expectedResult, result);
	    }
		
	@Test
	    public void test_naturalLog() {
	        double a = 2.718;
	        double expectedResult = 1.0;
	        double result = App.natlog(a);
	        Assert.assertEquals(expectedResult, result, 0.2f);
	    }
	
	@Test
	    public void test_power() {
	        double a = 2.0;
			double b = 10.0;
	        double expectedResult = 1024.0;
	        double result = App.powerfxn(a,b);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
}
