package CommonUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {

	public static boolean waitPeriod(WebDriver driver, String objectElement) throws InterruptedException{
		boolean isElelmentpresent = true;
				
		int index=0;

		while (index<8) {
			try {

				boolean stsusabc=driver.findElement(By.xpath(objectElement)).isEnabled();
				
				break;
			} catch (Exception e) {

				if (index<7) {
					Thread.sleep(3000);
					index++; 
					continue;
				} else {
					isElelmentpresent=false;
					break;
				}


			}

		}

		return isElelmentpresent;
	}
}
