package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "src\\test\\resources\\Features\\log.feature"
		,glue = {"Runner"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		,publish = true
		
		)


public class Runner extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
