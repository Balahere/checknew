package test.maven.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestingSikuli {
	
static WebDriver driver;

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Tools\\Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe") ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		//driver.get("https://www.youtube.com/watch?v=rjgkguWuhvg");
		
		Thread.sleep(1000);
		
		Screen screen = new Screen();
		/*Pattern pause = new Pattern("D:\\images\\pause.PNG");
		Pattern play = new Pattern("D:\\images\\play.PNG");*/
		Pattern run = new Pattern("D:\\images\\run.PNG");
		Pattern clickrun = new Pattern("D:\\images\\clickrun.PNG");
		//screen.wait(pause, 10);
		//screen.click(pause);
		Thread.sleep(1000);
		
		//screen.click(play);
		//screen.find(run);
		screen.click(run);
		screen.type("cmd");
		screen.click();
		Thread.sleep(1000);
		screen.click(clickrun);
		System.out.println("testing git");
		
		
	
		
	}

}
