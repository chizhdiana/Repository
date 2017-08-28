#регистрируем хаб:
#java -jar selenium-server-standalone-3.4.0.jar -port 4444 -role hub
 # РЕГИСТРИРУЕМ НОДЫ(три браузера)
##java -jar selenium-server-standalone-3.4.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5555 -browser browserName=firefox
#java -Dwebdriver.ie.driver=IEDriverServer.exe -jar selenium-server-standalone-3.4.0.jar -role webdriver -hub http://192.168.204.250:4444/grid/register -port 5556 -browser browserName=iexplorer
#java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.4.0.jar -role webdriver -hub http://192.168.204.250:4444/grid/register -port 5557 -browser browserName=chrome

import sys
import unittest
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

class NavigTest(unittest.TestCase):
    PLATFORM = 'WINDOWS'
    BROWSER = 'firefox'

    def setUp(self):
        capabilities = {}
        capabilities['platform'] = self.PLATFORM
        capabilities['browserName'] = self.BROWSER

        self.driver = webdriver.Remote(' http://192.168.204.250:5555/wd/hub', capabilities)


        self.driver.get('http://www.google.com')

        self.driver.implicitly_wait(30)
       # self.driver.maximize_window()



    def testBrowserNavigation(self):
        # get the search textbox
        driver = self.driver
        search_field = self.driver.find_element_by_name("q")
        search_field.clear()

        # enter search keyword and submit
        search_field.send_keys('selenium webdriver')
        search_field.submit()

        se_wd_link = driver.find_element_by_link_text("Selenium WebDriver")
        se_wd_link.click()
        self.assertEqual("Selenium WebDriver", driver.title)
        driver.back()
       # self.assertTrue(
           # WebDriverWait(self.driver, 10).until(expected_conditions.title_is('selenium webdriver - Google Search')))
        driver.forward()
        self.assertTrue(WebDriverWait(self.driver, 10).until(expected_conditions.title_is('Selenium WebDriver')))

        driver.refresh()
        self.assertTrue(WebDriverWait(self.driver, 10).until(expected_conditions.title_is('Selenium WebDriver')))

    def tearDown(self):
        self.driver.quit()


if __name__ == '__main__':
    if len(sys.argv) > 1:
        SearchProducts.BROWSER = sys.argv.pop()
        SearchProducts.PLATFORM = sys.argv.pop()
    unittest.main(verbosity=2)
