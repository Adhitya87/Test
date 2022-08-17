package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.RegisterPage;
import starter.page.SignInPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignInStep {
    SignInPage signInPage;
    RegisterPage registerPage;

    @Step
    public void OnLoginPage() {signInPage.open();}
    @Step
    public void UserNameField(String username){registerPage.username(username);}
    @Step
    public void PasswordField(String password){registerPage.password(password);
    }
    @Step
    public void clickButtonLogin() {signInPage.clickbuttonLogin();}
//    @Step
//    public void clickButtonSkip() {signInPage.clickbuttonskip();}
//    @Step
//    public void verifyOnLandingPageUser() {
//    assertEquals("Start Trading", SignInPage.myDashboard());}
}
