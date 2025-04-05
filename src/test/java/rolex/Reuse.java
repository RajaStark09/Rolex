package rolex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reuse implements Reusable {
	public static WebDriver driver;
	public static Actions action;
	public static Wait wait;
	public static JavascriptExecutor js;
	public static Select s;
	public static Properties rolex;

	public static void browserLaunch() {
		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		ChromeOptions co = new ChromeOptions();
//		System.out.println(co.getBrowserName());
//		co.addArguments("start-maximized");
//		co.addArguments("--disable-popups");
//		co.addArguments("--disable-notification");
		
				
//		try {
//			String lexUrl = null ;
//			File f = new File(".\\src\\test\\resources\\property.properties");
//			FileInputStream inp = new FileInputStream(f);
//			rolex = new Properties();
//			rolex.load(inp);
//			FileOutputStream ot = new FileOutputStream(f);
//			rolex.setProperty("name","Rajasekar");
//			rolex.save(ot, lexUrl);
//			}	
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability("platformname", "windows 10");
//		dc.setBrowserName("Edge");
//		dc.setCapability("version", "134");
//		System.out.println(dc.getCapability("platformname"));
//		System.out.println(dc.getBrowserName());
//		System.out.println(dc.getCapability("version"));
		
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		action = new Actions(driver);
		js = (JavascriptExecutor)driver;
		driver.get("https://www.zomato.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public void button(WebElement ele , int a) {
		action.click(ele).build().perform();
	}
	public void elebutton(WebElement element,String string) {
		element.sendKeys(string);
	}
	public void actsendText(String input, WebElement ele) {
		action.sendKeys(input).build().perform();
	}

	public void jssendText(String input, WebElement ele) {
		js.executeScript("arguments[0].setAtrribute('value', '"+input+"')", ele);
	}
	public void scrollDown(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}

	public void scrollUp(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

	public void byIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}
	
	public void mouseHoverToElement(WebElement ele) {
		action.moveToElement(ele).build().perform();
	}
	
	public void byVisibleValue(WebElement ele, String input) {
		s = new Select(ele);
		s.selectByValue(input);
	}

	public List<WebElement> listOptions(WebElement ele) {
		s = new Select(ele);
		List<WebElement> options = s.getOptions();
		return options;
	}


	public void childWindow(String parent) {
		Set<String> child = driver.getWindowHandles();
		for(String x:child) {
			if(!parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}

	public void rightClick(WebElement ele) {
		action.click(ele).build().perform();
	}

	public void parentFrame() {

	}

	public void mainFrame() {

	}

	public void nextFrame(String Name) {

	}

	public String returnText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public String returnAttribute(WebElement Ele, String Attribute) {

		return null;
	}

	public String returnCSSValue(WebElement Ele, String cssName) {

		return null;
	}

	public String button1(WebElement ele, int i) {

		return null;
	}

	public void screenShot(String name) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./target/image.png");
		try {
			FileUtils.copyFile(source, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void dragDrop(WebElement ele1, WebElement ele2) {

	}

	public void parentWindow(String parent) {
		driver.switchTo().window(parent);
	}
	public String returngetTitle(WebElement Ele) {
		String title = driver.getTitle();
		return title;
	}
	public String buttons(WebElement ele, int i) {
		
		return null;
	}
	public void sendText(WebElement ele, String input) {
		
		
	}
}
