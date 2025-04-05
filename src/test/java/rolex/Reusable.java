package rolex;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface Reusable {

	public void button(WebElement ele , int b);
	public void elebutton(WebElement element,String string);
	public void sendText(WebElement ele, String input);
	public void actsendText(String input , WebElement ele);
	public void jssendText(String input , WebElement ele);
	public void scrollDown(WebElement ele);
	public void scrollUp(WebElement ele);
	public void byIndex(WebElement ele, int index);
	public void byVisibleValue(WebElement ele , String input);
	public void mouseHoverToElement(WebElement ele);
	public void childWindow(String parent);
	public void parentWindow(String parent);
	public void rightClick(WebElement ele);
	public void parentFrame();
	public void mainFrame();
	public void nextFrame(String Name);
	public String returnText(WebElement Ele);
	public String returngetTitle(WebElement Ele);
	public String returnAttribute(WebElement Ele , String Attribute);
	public String returnCSSValue(WebElement Ele, String cssName);
	public String buttons(WebElement ele,int i);
	public void screenShot(String name);
	public void dragDrop(WebElement ele1 , WebElement ele2);
	public List<WebElement>listOptions(WebElement ele);
	
}
