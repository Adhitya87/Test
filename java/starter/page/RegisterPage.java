package starter.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://stockbit.com/")
public class RegisterPage extends PageObject {
    @FindBy(how = How.XPATH,using = "//*[@id=\"landing-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[2]")
    WebElement buttonRegister;
    @FindBy(how = How.XPATH,using = "//*[@id=\"__next\"]/div/div[3]/div/p[2]")
    WebElement textSignUp;
    @FindBy(how = How.XPATH,using = "//*[@id=\"email-register\"]/p")
    WebElement emailRegistry;
    @FindBy(id = "fullname")
    WebElement inputName;
    @FindBy(id = "email")
    WebElement inputEmail;
    @FindBy(id = "username")
    WebElement inputUserName;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "confirm-password")
    WebElement inputConfirmPassword;
    @FindBy(how = How.XPATH, using= "//*[@id=\"register-button\"]")
    WebElement btnSignUp;

    public void clickbuttonregister (){
        buttonRegister.click();
    }
    public void clickButtonRegisterWithEmail(){emailRegistry.click();}
//    public String verifyRegisterPage() {return textSignUp.getText();}
    public void name(String name){
        inputName.sendKeys(name);
    }
    public void email(String email){
        inputEmail.sendKeys(email);
    }
    public void username(String username){
        inputUserName.sendKeys(username);
    }
    public void password(String password){
        inputPassword.sendKeys(password);
    }
    public void confirmpassword(String confirmpassword) {inputConfirmPassword.sendKeys(confirmpassword);}
    public void buttonSignUp(){
        btnSignUp.click();
        element(btnSignUp).waitUntilVisible();
    }
    public void okOnAlertSuccessSignUp(){
        btnSignUp.click();
    }



}

