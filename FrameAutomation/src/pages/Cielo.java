package pages;

import org.openqa.selenium.WebElement;

import setUp.BaseUtil;

public class Cielo  extends BaseUtil {
	
	public WebElement carrocel() {
		return idSelector("__layout");
	}
	
	public WebElement botao() {
		return cssSelector(".navbar-item.has-dropdown.is-hoverable.is-mega", 1);
	}
	
	

}
