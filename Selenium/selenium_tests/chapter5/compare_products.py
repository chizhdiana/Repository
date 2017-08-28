from selenium import webdriver
import unittest
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions

class CompareProducts(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
        self.driver.get("http://demo.magentocommerce.com/")

    def test_compare_products_removal_alert(self):
         # get the search textbox
         search_field = self.driver.find_element_by_xpath('//*[@id="nav-main"]/div/div[2]/div[1]/a[1]')
         search_field.click()
         # enter search keyword and submit
         search_field2 = self.driver.find_element_by_id("edit-keys" )
         search_field2.send_keys("phones")
         search_field2.submit()
         #click the Add to chapter5 link
         self.driver.find_element_by_link_text("Add to Compare").click()

          # click on Remove this item link, this will display
         #  an alert to the user
         self.driver.find_element_by_link_text("Clear All").click()

          #switch to the alert
         alert = self.driver.switch_to.alert()

         # get the text from alert
         alert_text = alert.text

         #check alert text
         self.assertEqual('Are you sure you would like to remove all products from your comparison?',
                          alert_text)
         # click on Ok button
         alert.accept()

    def tearDown(self):
        self.driver.quit()

    if __name__ == '__main__':
        unittest.main(verbosity=2)

