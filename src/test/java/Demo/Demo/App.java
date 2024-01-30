package Demo.Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\chromedriver.exe");
            // Instantiate a ChromeDriver class.
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.xpath("(//div[@class='_6lux'])[1]/input")).sendKeys("xyz2gmail.com");
            driver.findElement(By.xpath("(//div[@class='_6lux'])[2]/div/input")).sendKeys("123");
            driver.findElement(By.xpath("(//div[@class='_6ltg'])[1]/button")).click();
           //driver.close();
            String a=driver.getTitle();
            System.out.println("The Page Tittle is:"+a);
    }
}
