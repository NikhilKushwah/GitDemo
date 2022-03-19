package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FireFoxTest
{
	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		// Creating desiredcapabilities class which will help on which browser and platform need to be run 
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setBrowserName("firefox");// this will open in chrome 
		// you can use setplatform also means on which operating system you want to Run
		//caps.setPlatform(Platform.WIN10);
		
		//you can set the capabitilites also like proxy or ssl certificate n all
		//caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		
		//creating URL Class so we can connect to the HUB this will get in Hub CMD under Hub execute
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.144:4444"), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
