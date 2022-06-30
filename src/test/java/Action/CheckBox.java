package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    WebDriver driver;


    public CheckBox(WebDriver driver) {

        this.driver = driver;


    }

    public static void Check(WebDriver driver, By locator)
    {
        Click click = new Click ( driver );
        String checkBoxElement = driver.findElement(By.cssSelector("md-checkbox")).getAttribute("class");
        boolean isSelected = checkBoxElement.contains("md-checked");

        if (isSelected == false)
        {
            click.On(driver, locator);
        }
    }



    public static void UnCheck(WebDriver driver, By locator)
    {

        String checkBoxElement = driver.findElement(By.cssSelector("md-checkbox")).getAttribute("class");
        boolean isSelected = checkBoxElement.contains("md-checked");

        if (isSelected == true)
        {
            Click.On(driver, locator);
        }
    }

    }

