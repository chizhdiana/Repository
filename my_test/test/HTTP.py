import urllib.request as ur
url = 'https://mail.google.com/mail/u/0/#inbox/15c3a1f99dc98ab0'
conn = ur.urlopen(url)
data=conn.read()
print(conn)

print(data)
print(conn.status)

