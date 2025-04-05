package rolex;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends Reuse{
	
@Before
public void launch(Scenario scenario)
{
	Reuse.browserLaunch();
	final byte[] image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(image, "image/png");
}
	
@After
public void tearDown()
{
	driver.quit();
}

}
