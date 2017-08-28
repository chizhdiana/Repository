from selenium import webdriver
import unittest
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

class  RegisterNewUser(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
       # self.driver.maximize_window()
        self.driver.get("http://demo.magentocommerce.com/")

    def test_register_new_user(self):
        driver = self.driver

        # click on Log In link to open Login page

        driver.find_element_by_link_text('MY ACCOUNT').click()
        # get the Create Account button
        create_account_button = self.driver.find_element_by_xpath('//*[@id="login-form"]/div/div/div[2]/div/button')
        # check Create Account button is displayed and enabled
        self.assertTrue(create_account_button.is_displayed() and create_account_button.is_enabled())
        create_account_button.click()
        # check title
        self.assertEqual("Create New Customer Account", driver.title)
        # get all the fields from Create an Account form
        first_name = self.driver.find_element_by_id("firstname")
        self.assertTrue(first_name.is_displayed())
        last_name = self.driver.find_element_by_id("lastname")
        self.assertTrue(last_name.is_displayed())
        email_adress = self.driver.find_element_by_id("email_address")
        self.assertTrue(email_adress.is_displayed())
        new_lettter_subscription = self.driver.find_element_by_id("screen_name")
        self.assertTrue(new_lettter_subscription.is_displayed())
        password = self.driver.find_element_by_id("password")
        self.assertTrue(password.is_displayed())
        confirm_password = self.driver.find_element_by_id("confirmation")
        self.assertTrue(confirm_password.is_displayed())
        submit_button = self.driver.find_element_by_xpath('//*[@id="registerSubmit"]/span/span')
        self.assertTrue(submit_button.is_displayed())

        # check maxlength of first name and last name textbox
       # self.assertEqual('255', first_name.get_attribute('maxlength'))
        #self.assertEqual('255', last_name.get_attribute('maxlength'))

        # check all fields are enabled
        self.assertTrue(first_name.is_enabled() and last_name.is_enabled() and
                        email_adress.is_enabled() and
                        new_lettter_subscription.is_enabled() and
                        password.is_enabled() and confirm_password.is_enabled()
                        and submit_button.is_enabled())


        # list of expected values in company dropdown
        expected_options = ["Select Option", "Is a merchant who sells online", "Develops Magento extensions","Provides deployment, customization and integration services to merchants","Tech Partner", "Analyst/Media"]

        # listof actual values
        act_options = []
        #GET COMPANY_OPTIONS VALUES
        select_company =  Select(self.driver.find_element_by_id("customer_company_type"))
        # check number of options in dropdown
        self.assertEqual(6,len(select_company.options))
        # get options in a list
        for option in select_company.options:
            act_options.append(option.text)

            print(option.text)

        # check expected options list with actual options list
        self.assertListEqual(expected_options, act_options)

        my_role = Select(self.driver.find_element_by_id("customer_individual_role"))
        expect_my_role_list = ["Select Option", "Business/sales/marketing/merchandising", "Technical/developer"]
        act_my_role_list =[]
        self.assertEqual(3, len(my_role.options))
        for option in my_role.options:
            act_my_role_list.append(option.text)
            print(option.text)
        self.assertListEqual(expect_my_role_list,act_my_role_list)


        # fill out all the fields
        first_name.send_keys('Test')
        last_name.send_keys('User1')
        email_adress.send_keys('chizhdiana1@gmail.com')

        # check default selected option is Selected Option
        self.assertEqual("Select Option", select_company.first_selected_option.text)
        # select an option using select_by_visible text
        select_company.select_by_visible_text("Analyst/Media" )
        # check store is now Is a Analyst/Media
        self.assertTrue("Analyst/Media" in select_company.first_selected_option.text)

        # check default selected option in MY ROLE is Selected Option
        self.assertEqual("Select Option", my_role.first_selected_option.text)
        # select an option using select_by_visible text
        my_role.select_by_visible_text("Technical/developer")
        # check store is now Is a "Technical/developer"
        self.assertTrue("Technical/developer" in my_role.first_selected_option.text)

        new_lettter_subscription.send_keys("user")
        self.assertTrue("user", new_lettter_subscription.text)




        password.send_keys('tester')
        confirm_password.send_keys('tester')

        #check the message if password is incorrect
        validate_message=self.driver.find_element_by_id("advice-validate-password-password")
        self.assertEqual("You have selected an invalid password. Your password must have a minimum of 8 characters and include: at least 1 capital letter, at least 1 number, at least 1 special character or 1 lower case letter.",  validate_message.text)
        self.driver.set_script_timeout(30)
        password.click()
        password.clear()
        confirm_password.click()
        confirm_password.clear()
        self.driver.implicitly_wait(30)


        password.send_keys('Q1w2e3r4t5;')
        confirm_password.send_keys('Q1w2e3r4t5:')
        submit_button.submit()

        self.assertTrue("Please make sure your passwords match.", self.driver.find_element_by_id("advice-validate-cpassword-confirmation").is_displayed())

        self.assertTrue(validate_message.is_enabled())
        confirm_password.clear()
        confirm_password.send_keys('Q1w2e3r4t5;')


        # check Sign Up for Newsletter is unchecked
        agree_box = self.driver.find_element_by_id("agree_terms")
        self.assertFalse(agree_box.is_selected())
        agree_box.submit()
        self.assertTrue(agree_box.is_selected())

        # click Submit button to submit the form
        submit_button.submit()

        # check new user is registered
        self.assertEqual('Hello, Test ' + "User1"+ '!',
                         driver.find_element_by_css_selector('p.hello > strong').text)
        driver.find_element_by_link_text('ACCOUNT').click()
        self.assertTrue(driver.find_element_by_link_text('Log Out').is_displayed())

    def tearDown(self):
        self.driver.quit()

    if __name__ == '__main__':
        unittest.main(verbosity=2)
