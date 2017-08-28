import unittest
from selenium import webdriver
from selenium.common.exceptions import NoSuchElementException
from selenium.webdriver.common.by import By

class HomePageTests(unittest.TestCase):
    @classmethod
    def setUp(cls):
        cls.driver = webdriver.Chrome()
        cls.driver.implicitly_wait(30)
        # driver.maximize_window()
        # navigate to the application home pages
        cls.driver.get("https://magento.com/")
        cls.driver.implicitly_wait(30)

    def test_search_field(self):
        # check search field excists on Home page
         self.assertTrue(self.is_element_present(By.XPATH,'//*[@id="nav-main"]/div/div[2]/div[1]/a[1]'))

    def test_language_option(self):
        # check language options drop down on home page
        self.assertTrue(self.is_element_present(By.ID, "select-language"))

  #  def test_shopping_cart_empty_message(self):
        # check content of My Shopping Cart block on home page
       # shopping_cart_status = self.driver. \
          #  find_element_by_css_selector('#minicart-content-wrapper > div.block-content > strong > span').text
      #  self.assertEqual('You have no items in your shopping cart.',
              #           shopping_cart_status)
      #  close_button = self.driver. \
          #  find_element_by_css_selector('div.minicart-wrapper a.close')
     #   close_button.click()

    @classmethod
    def tearDown(cls):
        cls.driver.quit()

    def is_element_present(self, how, what):
        """
               Utility method to check presence of an element on page
               :params how: By locator type
               :params what: locator value
               """

        try:
            self.driver.find_element(by=how,value=what)
        except NoSuchElementException:
            return  False



        return True
if __name__ == '__main__':
    unittest.main(verbosity=2)
