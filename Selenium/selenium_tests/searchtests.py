import unittest
from selenium import webdriver
from selenium.common.exceptions import NoSuchElementException
from selenium.webdriver.common.by import By


class SearchTests(unittest.TestCase):
    @classmethod
    def setUp(cls):
        cls.driver = webdriver.Chrome()
        cls.driver.implicitly_wait(30)
        # driver.maximize_window()
        # navigate to the application home pages
        cls.driver.get("https://magento.com/")
        cls.driver.implicitly_wait(30)
        cls.driver.title

    def test_search_by_category(self):
        # get the search text box
        self.search_field = self.driver.find_element_by_xpath('//*[@id="nav-main"]/div/div[2]/div[1]/a[1]')
        # search_field.clear()
        self.search_field.click()
        # eter search keyword and submit
        self.search_field_string = self.driver.find_element_by_name('keys')
        self.search_field_string.click()
        self.search_field_string.send_keys("phones")
        self.search_submit = self.driver.find_element_by_xpath('//*[@id="edit-basic"]/div/div/div[2]/div/button').submit()
        # get all the anchor elements which have product names displayed
        # currently on result page using find_elements_by_xpath method

        product1 = self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li[1]/div[1]/a')
        product2 = self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li[2]/div[1]/a')
        product3 = self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li[3]/div[1]/a')
        product4 = self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li[4]/div[1]/a')
        product5 = self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li[5]/div[1]/a')

        products = []
        products.append(product1)
        products.append(product2)
        products.append(product3)
        products.append(product4)
        products.append(product5)

        # get the number of anchor elements found
        print("found" + str(len(products)) + "  " + "products:")
        self.assertEquals(5,len(products))

    def test_search_by_name(self):
        self.search_field = self.driver.find_element_by_xpath('//*[@id="nav-main"]/div/div[2]/div[1]/a[1]')
        # search_field.clear()
        self.search_field.click()
        # eter search keyword and submit
        self.search_field_string = self.driver.find_element_by_name('keys')
        self.search_field_string.click()
        self.search_field_string.send_keys("salt shaker")
        self.search_submit = self.driver.find_element_by_xpath(
            '//*[@id="edit-basic"]/div/div/div[2]/div/button').submit()
        products2 = [self.driver.find_element_by_xpath('//*[@id="gl-container"]/div[2]/div/div[2]/ul/li/div[2]')]
        for product in products2:
            if product.text== 'No results':
                print(product.text)
                self.assertEquals('No results',product.text ,"OOOO!!!!")


    @classmethod
    def tearDown(cls):
        cls.driver.quit()



if __name__ == '__main__':
    unittest.main(verbosity=2)
