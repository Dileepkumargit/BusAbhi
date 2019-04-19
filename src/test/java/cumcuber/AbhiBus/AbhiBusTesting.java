package cumcuber.AbhiBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AbhiBusTesting {
	private WebDriver driver;
	 @Given("^open the abhibus website$")
	    public void open_the_abhibus_website() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.abhibus.com");
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	    }
	    @And("^enter the current city and destination city$")
	    public void enter_the_current_city() throws Throwable {
	    	driver.findElement(By.id("source")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//li[text()='"+"Bangalore"+ "']")).click();
	    	driver.findElement(By.id("destination")).sendKeys("Chennai");
			driver.findElement(By.xpath("//li[text()='"+"Chennai"+"']")).click();
	    }
	    @And("^enter the date of journey$")
	    public void enter_the_date_of_journey() throws Throwable {
	    	WebElement datepick = driver.findElement(By.id("datepicker1"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='20-04-2019'", datepick);
			datepick = driver.findElement(By.id("datepicker2"));
			js.executeScript("arguments[0].value='22-04-2019'", datepick);
	    }
	    @And("^click on search$")
	    public void click_on_search() throws Throwable {
	    	driver.findElement(By.xpath("//a[@class=\"btnab icosearch\"]")).click();
	    }

	    @Then("^select the bus and choose the seat$")
	    public void select_the_bus_and_choose_the_seat() throws Throwable {
	    	driver.findElement(By.id("522183726")).click();
			driver.findElement(By.id("O5-9ZZ")).click();
	    }
	    @And("^enter the boarding point and book the return ticket$")
	    public void enter_the_boarding_point_and_book_the_return_ticket() throws Throwable {
	    	Select BP = new Select(driver.findElement(By.id("boardingpoint_id1")));
			BP.selectByIndex(1);
			driver.findElement(By.id("btnEnable1")).click();
	    }

	    @And("^chose the bus and select the seat$")
	    public void chose_the_bus_and_select_the_seat() throws Throwable {
	    	driver.findElement(By.id("522830888")).click();
			driver.findElement(By.id("O1-4ZZ")).click();
			
	    }

	    @And("^enter the boarding point and click on paymant$")
	    public void enter_the_boarding_point_and_click_on_paymant() throws Throwable {
	    	Select Bp = new Select(driver.findElement(By.id("boardingpoint_id2")));
			Bp.selectByIndex(1);
	    }

	}


