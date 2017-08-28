import sys
import unittest
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
from sauceclient import SauceClient



class SearchProducts(unittest.TestCase):
 PLATFORM = 'Windows 10'
 BROWSER = 'chrome'
 VERSION = '60.0'
 SAUCE_USERNAME = 'chizhdiana'
 SUACE_KEY = '3fe618ea-a79f-468c-88f0-d5104b77c14d'
 BUILD = 'build-1234'

 def setUp(self):
     caps = {'browserName': "chrome"}
     caps['platform'] = self.PLATFORM
     caps['version'] =self.VERSION
     caps['build'] =self.BUILD


     sauce_string = self.SAUCE_USERNAME + ':' + self.SUACE_KEY
     self.driver = webdriver.Remote('http://' + sauce_string + '@ondemand.saucelabs.com:80/wd/hub',
                                                 caps)


     self.driver.implicitly_wait(30)
     self.driver.get('http://www.google.com')
     self.driver.implicitly_wait(30)

     if not "Google" in self.driver.title:
         raise Exception("Unable to load google page!")


     # self.driver.maximize_window()



 def testBrowserNavigation(self):
     # get the search textbox

     search_field = self.driver.find_element_by_name("q")
     search_field.clear()

     # enter search keyword and submit
     search_field.send_keys('selenium webdriver')
     search_field.submit()

     print(self.driver.title)

     se_wd_link = self.driver.find_element_by_link_text("Selenium WebDriver")
     se_wd_link.click()
     self.assertEqual("Selenium WebDriver", self.driver.title)
     self.driver.back()
     self.assertTrue(
         WebDriverWait(self.driver, 10).until(expected_conditions.title_is('seleniumn webdriver - Google Search')))
     self.driver.forward()
     self.assertTrue(WebDriverWait(self.driver, 10).until(expected_conditions.title_is('Selenium WebDriver')))

     self.driver.refresh()
     self.assertTrue(WebDriverWait(self.driver, 10).until(expected_conditions.title_is('Selenium WebDriver')))

 def tearDown(self):
     job_passed = sys.exc_info() == ()
     sauce_client = SauceClient("chizhdiana", "3fe618ea-a79f-468c-88f0-d5104b77c14d")
     sauce_client.jobs.get_jobs(full=True, limit=5)
     self.driver.quit()


if __name__ == '__main__':
    if len(sys.argv) > 1:
        SearchProducts.BROWSER = sys.argv.pop()
        SearchProducts.PLATFORM = sys.argv.pop()
        unittest.main(verbosity=2)





