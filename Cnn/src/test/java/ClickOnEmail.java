import org.testng.annotations.Test;

public class ClickOnEmail extends FaceBook{


    @Test
    public void test1(){
        click("reg_email__","mshossain1166@65gmail,com");
    }

    @Test
    public void test2(){
    goDevoloper("#js_0 > ul > li:nth-child(21) > a");
    }

    @Test
    public void test3(){
    findFriends("#js_0 > ul > li:nth-child(5) > a");
    }

    @Test
    public void test4(){
    selectMale("u_0_a");
    }

    @Test
    public void test5(){
    massengerforwardBack("a[href*=messenger]","email","mshossain1166@65gmail,com");
    }

    @Test
    public void test6(){
    findAnyobe("#js_0 > ul > li:nth-child(5) > a","a[id^=forgot]","http://amazon.com");
    }

    @Test
    public void test7(){
    changeLanguage("a[onclick*=es_LA]");
    }

    @Test
    public void test8(){
    putFristName("u_0_c","Mohammad");
    }

    @Test
    public void test9(){
    lastNameAndSignUp("lastname","Hossain","u_0_u","http://faceBook.com/");
    }

    @Test
    public void test10(){
    recoverPass("a[href*=recover]","email","mshossain1166@65gmail,com");
    }




}
