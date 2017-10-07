package gbhMain;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GBHMainTest {
	public static WebDriver driver; 
	public String workingPath = System.getProperty("user.dir"); 
	
	
	@Given("^user is on GBH Main page$")
	public void user_is_on_GBH_Main_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Chrome set up 
		System.setProperty("webdriver.chrome.driver",  workingPath + "/src/Drivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		
		//Chrome set up ends here 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gbh.com.do/");
	
		
	    
	}

	@Then("^user goes to Services page$")
	public void user_goes_to_Services_page() {
	    // Write code here that turns the phrase above into concrete actions
		Actions action = new Actions(driver); 
		WebElement moveTo = driver.findElement(By.xpath("//*[@id=\'menu-item-209\']")); 
		action.moveToElement(moveTo).build().perform(); 
		driver.findElement(By.id("menu-item-2642")).click();
		
	}

	@Then("^user goes Portfolio page$")
	public void user_goes_Portfolio_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user goes to About Us page$")
	public void user_goes_to_About_Us_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user goes to Jobs page$")
	public void user_goes_to_Jobs_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user goes to Blog page$")
	public void user_goes_to_Blog_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^goes back to main page$")
	public void goes_back_to_main_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
