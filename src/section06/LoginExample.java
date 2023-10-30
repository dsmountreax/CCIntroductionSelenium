package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {

	public static void main(String[] args) {

		String path=System.getProperty("user.dir");
		String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",pathChrome);
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless");
		//WebDriver driver = new ChromeDriver(options);
		System.out.println(pathChrome);
		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");			//Hit Url of facebook
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("¿Has olvidado la contraseña?")).click();

	}

}