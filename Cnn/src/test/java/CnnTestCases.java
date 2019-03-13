import base.MainClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CnnTestCases extends MainClass {


    @Test
    public void search(){
        driver.findElement(By.id("search-button")).click();
        driver.findElement(By.cssSelector("#search-input-field")).sendKeys("Sports", Keys.ENTER);

    }
    @Test
    public void goToVideos(){
        driver.findElement(By.id("search-button")).click();
        driver.findElement(By.cssSelector("#search-input-field")).sendKeys("Sports", Keys.ENTER);
        driver.findElement(By.cssSelector("label[for^=collection_all]")).click();
        driver.navigate().refresh();
    }


}
