package extendreports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

}
