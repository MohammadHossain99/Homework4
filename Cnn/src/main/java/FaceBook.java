import base.MainClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FaceBook extends MainClass {



    public void click(String name,String email){
        driver.findElement(By.name(name)).sendKeys(email, Keys.ENTER);
    }

    public void goDevoloper( String locator){
        driver.findElement(By.cssSelector(locator)).click();
        driver.navigate().back();
    }

    public void findFriends(String locator){
        driver.findElement(By.cssSelector(locator)).click();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

    public void selectMale(String gender){
        driver.findElement(By.id(gender)).click();
    }

    public void massengerforwardBack(String css,String name,String email){
        driver.findElement(By.cssSelector(css)).click();
        driver.findElement(By.name(name)).sendKeys(email,Keys.ENTER);
        driver.navigate().back();
        driver.navigate().forward();
    }

    public void findAnyobe(String locator1,String locator2,String url){
        driver.findElement(By.cssSelector(locator1)).click();
        driver.findElement(By.cssSelector(locator2)).click();
        driver.navigate().back();
        driver.navigate().to(url);
    }


    public void changeLanguage(String language){
        driver.findElement(By.cssSelector(language)).click();
        driver.navigate().back();
    }

    public void putFristName(String id,String fName){
        driver.findElement(By.id(id)).sendKeys(fName,Keys.ENTER);
    }

    public void lastNameAndSignUp(String lName,String keys,String id,String url){
        driver.findElement(By.name(lName)).sendKeys(keys,Keys.ENTER);
        driver.findElement(By.id(id)).click();
        driver.get(url);
    }


    public void recoverPass(String locator,String id , String email){
        driver.findElement(By.cssSelector(locator)).click();
        driver.findElement(By.id(id)).sendKeys(email,Keys.ENTER);
        driver.navigate().refresh();
    }

}
