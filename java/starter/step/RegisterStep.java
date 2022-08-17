package starter.step;

import net.thucydides.core.annotations.Step;
import starter.page.RegisterPage;
import static org.junit.Assert.assertEquals;

public class RegisterStep {
    RegisterPage registerPage;
    SignInStep signInStep;

    @Step
    public void gotostockbitsite(){
        registerPage.open();
    }
    @Step
    public void clickbuttonregister(){
        registerPage.clickbuttonregister();
    }
    @Step
    public void clickButtonRegisterWithEmail(){
        registerPage.clickButtonRegisterWithEmail();
    }
//    @Step
//    public void verifyRegisterPage(){
//        assertEquals("By signing up you agree with our",
//        registerPage.verifyRegisterPage());}


    @Step
    public void InputName(String name){
        registerPage.name(name);
    }
    @Step
    public void InputEmail(String email){
        registerPage.email(email);
    }
    @Step
    public  void InputUserName(String username){
        registerPage.username(username);
    }
    @Step
    public void InputPassword(String password){
        registerPage.password(password);
    }
    @Step
    public void InputConfirmPassword(String confirmpassword){
        registerPage.confirmpassword(confirmpassword);
    }
    @Step
    public void  ClickRegisterButton() {
        registerPage.buttonSignUp();
    }






//    @Step
//    public void clickOkOnAlertSuccessSignUp(){
//        registerPage.okOnAlertSuccessSignUp();
//    }
//    @Step
//    public void verifyLoginPage(){
//        assertEquals("Login to your account.",loginPage.verifyLoginPage());
//    }
}



