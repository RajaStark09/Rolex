package rolex;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOne extends Reuse {
	
		Reuse r = new Reuse();
		
		@Given("Launch the application")
//		public void launch_the_application(String string) {
//		 Reuse.browserLaunch(string);
//}
		@When("Check user reached home page")
		public void check_user_reached_home_page() {
		    String title = driver.getTitle();
		    if (title.contains("Zomato")) {
		    	System.out.println("Home Page Reached");
		    } else {
		    	System.out.println("Home Page Not Reached");
		    }
		}
		@When("User clicks the search box and enter Pizza Delivery in Chennai")
		public void user_clicks_the_search_box_and_enter_pizza_delivery_in_chennai() throws InterruptedException {
		   WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		   r.elebutton(searchBox, "Pizza");
		   r.button(searchBox, 0);
		}

		@When("User enters into list of restaurants")
		public void user_enters_into_list_of_restaurants() {
			WebElement search = driver.findElement(By.xpath("//p[text()='Pizza - Delivery']"));
			r.button(search, 0);		
		}

		@When("User selects and view the pantry or restaurant")
		public void user_selects_and_view_the_pantry_d_or_restaurant() {
			WebElement selects = driver.findElement(By.xpath("//h4[text()='Famous Lassi & Juice Corner']"));
			r.button(selects, 0);	
		}

//		@When("User scroll and check the variety of food items")
//		public void user_scroll_and_check_the_variety_of_food_items() { 
//			WebElement down = driver.findElement(By.xpath("//p[text()='Desserts and Beverages (15)']"));
//			WebElement top = driver.findElement(By.xpath("//h1[text()='Famous Lassi & Juice Corner']"));
//		    JavascriptExecutor scroll = (JavascriptExecutor)driver;
//		    scroll.executeScript("arguments[0].scrollIntoView(false)",down);
//		    scroll.executeScript("arguments[0].scrollIntoView(true)",top);
//		}
//
//		@Then("Validate the User able to see all food items")
//		public void validate_the_user_able_to_see_all_food_items() {
//		   
//		}

		
	}

