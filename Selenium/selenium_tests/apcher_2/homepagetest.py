import unittest
from selenium import webdriver


class HomePageTest(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        cls.driver = webdriver.Chrome()
        cls.driver.implicitly_wait(30)
        # driver.maximize_window()
        # navigate to the application home pages
        cls.driver.get("http://demo.magentocommerce.com/")
        cls.driver.implicitly_wait(30)

    def test_search_text_field_max_length(self):
        # get the search textbox
        search_field = self.driver.find_element_by_xpath('//*[@id="nav-main"]/div/div[2]/div[1]/a[1]')
        search_field.click()
        search_field2 = self.driver.find_element_by_id("edit-keys")
        self.assertEqual("255", search_field2.get_attribute("maxlength"))

    def test_search_button_enabled(self):
        #get Search button
        search_button = self.driver.find_element_by_class_name("btn")
        # check Search button is enabled
        self.assertTrue(search_button.is_enabled())

    def test_my_account_link_is_displayed(self):
        # get the Account link
        acount_link = self.driver.find_element_by_link_text("MY ACCOUNT")
        #check my Account link is displayed /visible in
        # the Home page footer
        self.assertTrue(acount_link.is_displayed())

    def test_account_links(self):
        # get the all the links with Account text in it
        account_links = self.driver.find_elements_by_partial_link_text("MY ACCOUNT")
        # check Account and My Account link is
        #  displayed/visible in the Home page footer
        self.assertTrue(2,len(account_links))

    def test_count_of_promo_banners_images(self):
        # get promo banner list
        banner_list = self.driver.find_element_by_class_name("promos")
        # get images from the banner lists
        banners = banner_list.find_element_by_tag_name("img")
     # check there are 3 banners displayed on the page
        self.assertEqual(3,len(banners))

    def test_vip_promo(self):
        # get vip promo image
        vip_promo = self.driver.find_element_by_xpath("//img[@alt= 'Shop Private Sales - Members Only']")
        # check vi_promo log is displayed on home page
        self.assertEqual("VIP", self.driver.title)

    def test_shopping_cart_status(self):
        #chech content of my shopping cart block

       # get the Shopping cart icon and click to
        #  open the Shopping Cart section
        shopping_cart_icon = self.driver.find_element_by_css_selector("div.header-minicart span.icon")
        shopping_cart_icon.click()
        # get the shopping cart status
        shopping_cart_status = self.driver.find_element_by_css_selector("p.empty").text
        self.assertEqual("You have no items in your shopping cart.", shopping_cart_status)
        # close the shopping cart section
        close_button = self.driver.find_element_by_css_selector("div.minicart-wrapper a.close")
        close_button.click()

    @classmethod
    def tearDownClass(cls):
        cls.driver.quit()

    if __name__ == '__main__':    unittest.main(verbosity=2)

