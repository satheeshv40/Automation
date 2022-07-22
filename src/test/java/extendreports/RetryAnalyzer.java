package extendreports;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int count =1;
		int retrylimit=3;
		if(count<retrylimit) {
			count++;
			return true;
		}
		return false;
	}

}
