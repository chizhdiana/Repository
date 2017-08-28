from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
import unittest

class ExplicitWaitTests(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
       # self.driver.maximize_window()
        self.driver.get("http://demo.magentocommerce.com/")

    def test_account_link(self):
        driver = self.driver

        account = WebDriverWait(self.driver, 10) \
            .until(expected_conditions.visibility_of_element_located((By.LINK_TEXT, 'MY ACCOUNT')))
        self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.element_to_be_clickable((By.LINK_TEXT,'MY ACCOUNT'))))
        self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.presence_of_element_located((By.LINK_TEXT,'MY ACCOUNT'))))
        account.click()

        

    def test_create_new_customer(self):
        # click on Log In link to open Login page
        self.driver.find_element(By.LINK_TEXT,'MY ACCOUNT').click()

        create_account_button = self.driver.find_element_by_xpath('//*[@id="login-form"]/div/div/div[2]/div/button')
        # check Create Account button is displayed and enabled
        self.assertTrue(create_account_button.is_displayed() and create_account_button.is_enabled())
        self.assertTrue(
            WebDriverWait(self.driver, 10).until(expected_conditions.element_to_be_clickable((By.XPATH,'//*[@id="login-form"]/div/div/div[2]/div/button'))))
        create_account_button.click()

        self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.title_contains('Create New Customer Account')))
        first_name = self.driver.find_element_by_id("firstname")
        self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.visibility_of(first_name)))



    def tearDown(self):
         self.driver.quit()


    if __name__ == '__main__':
        unittest.main(verbosity=2)
