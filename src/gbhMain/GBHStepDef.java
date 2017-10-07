package gbhMain;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GBHStepDef {
	public static WebDriver driver; 
	public String workingPath = System.getProperty("user.dir"); 
	
	@Given("^user is on GBH Main page$")
	public void user_is_on_GBH_Main_page() throws Exception {
		//Chrome set up 
		System.setProperty("webdriver.chrome.driver",  workingPath + "/src/Drivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gbh.com.do/");
	
	    
	}

	
	public void moveTo() {
		Actions action = new Actions(driver); 
		WebElement moveTo = driver.findElement(By.xpath("//*[@id=\'menu-item-209\']")); 
		action.moveToElement(moveTo).build().perform(); 
		
	}
	@Then("^user goes to Services page$")
	public void user_goes_to_Services_page()  throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> services = driver.findElements(By.tagName("ul")); 
		System.out.println("Servicios: "+services.toArray().length);
		
		String[] serviceIDLinks = {"menu-item-2642", "menu-item-2976", "menu-item-226"
				,"menu-item-2895", "menu-item-1998", "menu-item-227", "menu-item-230",
				"menu-item-361", "menu-item-392", "menu-item-360", "menu-item-357", "menu-item-358", 
				"menu-item-356"}; 
			moveTo(); 
			driver.findElement(By.id(serviceIDLinks[0])).click(); //Asesoría de interfaz y experiencia de usuario (UX)
			moveTo();
			driver.findElement(By.id(serviceIDLinks[1])).click(); // Desarrollo de software
			moveTo();
			driver.findElement(By.id(serviceIDLinks[2])).click(); // Diseño de páginas web
			moveTo();
			driver.findElement(By.id(serviceIDLinks[3])).click(); // Manejo de redes sociales para empresas
			moveTo();
			driver.findElement(By.id(serviceIDLinks[4])).click(); // Consultoría Web
			moveTo();
			driver.findElement(By.id(serviceIDLinks[5])).click(); // SEO (optimización en motores de búsqueda)
			moveTo();
			driver.findElement(By.id(serviceIDLinks[7])).click(); // Mantenimiento preventivo  y correctivo
			moveTo();
			driver.findElement(By.id(serviceIDLinks[8])).click(); // Evaluación de infraestructura (IT)
			moveTo();
			driver.findElement(By.id(serviceIDLinks[9])).click(); // Configuración de respaldo
			moveTo();
			driver.findElement(By.id(serviceIDLinks[10])).click(); // Instalación de cableado estructurado
			moveTo();
			driver.findElement(By.id(serviceIDLinks[11])).click(); // Instalación y configuración de redes Wi-Fi
			moveTo();
			driver.findElement(By.id(serviceIDLinks[12])).click(); // Certificación de cableado estructurado
			
			
			
	}

	@Then("^user goes Portfolio page$")
	public void user_goes_Portfolio_page() throws Exception {
		Thread.sleep(2000);
	    driver.findElement(By.id("menu-item-62")).click();
	    
	}

	@Then("^user goes to About Us page$")
	public void user_goes_to_About_Us_page() throws Exception {
	  driver.findElement(By.id("menu-item-65")).click();
	    
	}

	@Then("^user goes to Jobs page$")
	public void user_goes_to_Jobs_page() throws Exception {
	    driver.findElement(By.id("menu-item-126")).click();
	    
	}

	@Then("^user goes to Blog page$")
	public void user_goes_to_Blog_page() throws Exception {
	   driver.findElement(By.id("menu-item-20")).click();
	   
	}

	@Then("^goes back to main page$")
	public void goes_back_to_main_page() throws Exception {
	    driver.findElement(By.id("menu-item-21")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("copy"))); 
	    driver.quit();
	    
	}

}
