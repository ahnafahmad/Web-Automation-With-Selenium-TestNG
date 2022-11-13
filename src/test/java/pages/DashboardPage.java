package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.Setup;

import java.util.List;

public class DashboardPage {

    @FindBy(className = "oxd-topbar-header-title")
    public WebElement txtDashboard;

    @FindBy(className="oxd-userdropdown-img")
    public WebElement imgProfile;

    @FindBy(className = "orangehrm-todo-list-item")
    public List<WebElement> canditateToInterviewOption;

    @FindBy(className = "oxd-topbar-header-title")
    public WebElement txtRecruitment;


    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

}
