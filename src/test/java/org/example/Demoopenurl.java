package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demoopenurl {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
      //  driver.get("https://github.com/login");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement checkBoxSelected= driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isselected = checkBoxSelected.isSelected();
        if(isselected==false){
            checkBoxSelected.click();
        }
        WebElement checkBoxEnabled= driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isEnabled = checkBoxEnabled.isEnabled();
        if(isEnabled==false){
            checkBoxEnabled.click();
        }
    }
}
