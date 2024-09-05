package pages;

import base.BaseClass;
import org.openqa.selenium.By;

public class Login extends BaseClass {

    public void sigin(){
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
    public void username(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shivakumar.mudili@dazn.com");
    }

    public void password(){
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("siva1996@M");
    }

    public void lgButton(){
        driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
    }
}
