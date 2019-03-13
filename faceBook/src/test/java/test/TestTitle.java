package test;

import base.MainClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTitle extends MainClass {


    @Test
    public void test(){
      String st =  driver.getTitle();
        System.out.println(st);
    }
    @Test
    public void getUrl(){
        System.out.println(driver.getCurrentUrl());
        try{
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
        }catch (Exception e){
            System.out.println("This is not Tested!");
        }
    }
}
