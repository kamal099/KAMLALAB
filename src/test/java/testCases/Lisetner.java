package testCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import dataresource.mainClass;

public class Lisetner implements ITestListener{
	
	 public  void onTestFailure(ITestResult result) {

		 mainClass cls= new mainClass();
		 try {
			cls.takeScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
	 
	 public void onTestSkipped(ITestResult result) {

	 
	 }

}
