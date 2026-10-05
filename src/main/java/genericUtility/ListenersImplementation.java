package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	 JavaUtility jutil=new JavaUtility();
	 String dateTimeStamp=jutil.getCalendardetails("dd-MM-YYYY hh-mm-ss");
	 ExtentReports reports;
	 ExtentTest test;
	 
	@Override
	public void onTestStart(ITestResult result) {
	String methodName=result.getMethod().getMethodName();	
	System.out.println(methodName+"--On Test Start Executed");
	//Create a field into report for every @Test method with method name
	test=reports.createTest(methodName);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();	
		System.out.println(methodName+"--On Test Success Executed");
		//Log the status as PASS
		test.log(Status.PASS, methodName+"-Successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();	
		System.out.println(methodName+"--On Test Failure Executed");
		//Log the status as FAIL and throwable message
		test.log(Status.FAIL, methodName+"-failed");
		test.log(Status.INFO,result.getThrowable());
		JavaUtility jutil=new JavaUtility();
		
		String screenshotName=methodName+"-"+dateTimeStamp;
		SeleniumUtility sutil=new SeleniumUtility();
		try {
			String path=sutil.takeWebpageScreenshot(BaseClass.sDriver, screenshotName);
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();	
		System.out.println(methodName+"--On Test Skipped Executed");
		//Log the detail as SKIP
		test.log(Status.SKIP, methodName+"-skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
			
		System.out.println("On Start Executed");
		//Configuration of Extent Reports
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\Extent_Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Generate an empty report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base OS", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Shruthi");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Executed");
	
		//flush the report
		reports.flush();

	}

}
