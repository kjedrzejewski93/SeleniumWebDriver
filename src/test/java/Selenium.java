import jdk.jshell.spi.ExecutionControl;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium {

    @Test
    public void openChrome(){
        WebDriver driver = new ChromeDriver();
        String path = "C:\\Users\\HP OMEN\\IdeaProjects\\seleniumWeb\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver.manage().window().maximize();
        driver.get("https://carry.pl/");


        WebElement profil = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        profil.click();

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("przykladowy@email.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password");
        password.sendKeys(Keys.ENTER);
    }
}
