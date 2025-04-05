//package rolex;
//
//import java.time.Duration;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DemoTwo {
//	public static WebDriver driver;
//	public static void browesrLaunch() {
//		
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
//		driver.get("https://www.zomato.com/");
//		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability("platformname", "windows 10");
//		dc.setBrowserName("Edge");
//		dc.setCapability("version", "134");
//		System.out.println(dc.getCapability("platformname"));
//		System.out.println(dc.getBrowserName());
//		System.out.println(dc.getCapability("version"));
//	}
//}
