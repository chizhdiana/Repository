import os
from selenium import webdriver

dir = os.path.dirname("D:\Program")
ie_driver_path =  dir + "\IEDriverServer.exe"


# create a new Internet Explorer session
driver = webdriver.Ie()
driver.implicitly_wait(30)


# navigate to the application home page
driver.get("http://demo.magentocommerce.com/")

