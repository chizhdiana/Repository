import unittest

import HTMLTestRunner
from selenium_tests.homepagetests import HomePageTests
from selenium_tests.searchtests import SearchTests
import os


# get the directory path to output report file
dir = os.getcwd()

# get all tests from SearchProductTest and HomePageTest class


search_tests = unittest.TestLoader().loadTestsFromTestCase(SearchTests)
home_page_tests = unittest.TestLoader().loadTestsFromTestCase(HomePageTests)

# create a test suite combining search_test and home_page_test
smoke_tests = unittest.TestSuite([home_page_tests, search_tests])

# open the report file
outfile = open(dir+"\SmokeTestReport.html", "w")

# configure HTMLRunner options
runner = HTMLTestRunner.HTMLTestRunner(stream=outfile,
                                       title='Test Report',
                                       description='Smoke Tests')

# run the suite
unittest.TextTestRunner(verbosity=2).run(smoke_tests)
