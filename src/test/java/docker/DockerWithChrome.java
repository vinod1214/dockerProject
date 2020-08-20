package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithChrome {

	@Test
	public void test1() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the page: " + driver.getTitle());
		driver.quit();
	}

}
