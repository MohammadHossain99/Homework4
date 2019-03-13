package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public WebDriver driver = null;


    @Parameters({"Browser","url"})
    @BeforeMethod
    public void logIn(String Browser,String url){

        if(Browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Homework/HomeWork4-master/Generic/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (Browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Homework/HomeWork4-master/Generic/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
//        System.setProperty("webdriver.chrome.driver","/Homework/HomeWork4-master/Generic/driver/chromedriver.exe");
//        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quit(){
        driver.close();
    }


}
