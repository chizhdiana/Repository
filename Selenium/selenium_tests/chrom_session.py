import os
from selenium import webdriver

# get the path of chromedriver

dir = os.path.dirname("C:\Windows\System32")
chrome_driver_path = dir + "\chromedriver.exe"

driver = webdriver.Chrome()
driver.implicitly_wait(30)

driver.get("http://demo.magentocommerce.com/")
