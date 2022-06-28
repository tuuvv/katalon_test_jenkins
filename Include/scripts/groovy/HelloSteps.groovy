//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//import cucumber.api.java.en.Given
//import cucumber.api.java.en.Then
//import cucumber.api.java.en.When
//
//
//public class HelloSteps {
//	@Given("user is login page")
//	public void user_is_login_page() {
//		WebUI.openBrowser('')
//
//		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
//	}
//
//	@When("user enter username and password")
//	public void user_enter_username_and_password() {
//		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')
//
//		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')
//	}
//
//	@Then("click on login button")
//	public void click_on_login_button() {
//		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h1_Dashboard'), 'Dashboard')
//	}
//}
