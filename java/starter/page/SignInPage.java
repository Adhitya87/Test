package starter.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;


@DefaultUrl("https://stockbit.com/login")
public class SignInPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"email-login-button\"]/p")
    WebElement textSignIn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"email-login-button\"]")
    WebElement btnSignIn;
    @FindBy(how = How.XPATH, using = "<div class=\"sc-ksluID htrsEW styled__InputContainer-w16pvr-6 gNAeNx\"><input type=\"text\" id=\"username\" placeholder=\"E-mail dan Username\" value=\"\" required=\"\" height=\"auto\" width=\"auto\" margin=\"0\" padding=\"5px\" p=\"0\" class=\"ant-input sc-kEqXSa styled__Input-w16pvr-1 hCNosv dAcaoR\"><div class=\"sc-bqGGPW dQrQnz\"></div><label weight=\"normal\" height=\"28px\" color=\"#B5B5B5\" align=\"left\" padding=\"0\" family=\"regular\" class=\"sc-crzoAE sc-dIsUp havcQb jEEywD\">E-mail dan Username</label></div>")
    WebElement clickusername;
    @FindBy(id = "username")
    WebElement putUserName;
    @FindBy(id = "password")
    WebElement putPassword;
//    @FindBy(how = How.XPATH, using = )
//    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div/div[1]/div[1]/a/div")
//    static
//    WebElement myDashboard;

    public String OnLoginPage() {
        return textSignIn.getText();}

    public void clickbuttonLogin() {
        btnSignIn.click();
    }
    public void username(String username){putUserName.sendKeys(username); }
    public void password(String password){
        putPassword.sendKeys(password);
    }


//    public static String myDashboard() {
//        return myDashboard.getText();
//    }


}