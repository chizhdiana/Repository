import requests
url = 'http://www.iheartquotes.com/api/v1/random'
resp = requests.get(url)
print(resp)
print(resp.text)

