from selenium import webdriver
import unittest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

class NavigationTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
        #self.driver.maximize_window()

        self.driver.get('http://www.google.com')

    def testBrowserNavigation(self):
        # get the search textbox
         driver = self.driver
         search_field = self.driver.find_element_by_name("q")
         search_field.clear()

        #enter search keyword and submit
         search_field.send_keys('selenium webdriver')
         search_field.submit()

         se_wd_link = driver.find_element_by_link_text("Selenium WebDriver")
         se_wd_link.click()
         self.assertEqual("Selenium WebDriver", driver.title)
         driver.back()
         self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.title_is('selenium webdriver - Google Search')))
         driver.forward()
         self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.title_is('Selenium WebDriver')))

         driver.refresh()
         self.assertTrue(WebDriverWait(self.driver,10).until(expected_conditions.title_is('Selenium WebDriver')))

    def tearDown(self):
         self.driver.quit()
