package test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
				WebDriver driver=new ChromeDriver();
				driver.get("http://localhost:8856/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
				TakesScreenshot obj= (TakesScreenshot) driver;
				File image=obj.getScreenshotAs(OutputType.FILE);
				
}

}


