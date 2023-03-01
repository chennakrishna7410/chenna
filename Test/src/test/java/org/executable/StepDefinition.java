package org.executable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver x;
	
	@Given("go to FB url")
	public void go_to_fb_url() {
	    WebDriverManager.edgedriver().setup();
	     x = new EdgeDriver();
	    x.get("https://www.facebook.com/");
	}

	@When("pass values in username")
	public void pass_values_in_username() {
	    WebElement f1 = x.findElement(By.xpath("//input[@id='email']"));
	    f1.sendKeys("chenna@gmail.com");
	}

	@When("pass values in password")
	public void pass_values_in_password() {
	    WebElement f2 = x.findElement(By.xpath("//input[@id='pass']"));
	    f2.sendKeys("12345");
	}


}
