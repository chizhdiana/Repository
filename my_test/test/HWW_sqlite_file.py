import sqlite3
import sqlalchemy
import csv
text = '''title,author,year
The	Weirdstone	of	Brisingamen,Alan	Garner,1960
Perdido	Street	Station,China	Mieville,2000
Thud!,Terry	Pratchett,2005
The	Spellman	Files,Lisa	Lutz,2007
Small Gods,Terry Pratchett,1992 '''

with open('books.csv', 'wt') as outfile:
   outfile.write(text)

db = sqlite3.connect('books.db')
curs = db.cursor()
#curs.execute('''create table book (title text, author text, year int)''')
ins_str = 'insert into book values(?, ?, ?)'
with open('books.csv', 'rt') as infile:
    books = csv.DictReader(infile)
    for book in books:
         curs.execute(ins_str, (book['title'], book['author'], book['year']))


sql = 'Select title from book order by title asc'
for row in db.execute(sql):
    print(row)
sql1 = 'Select * from book order by year'

for row in db.execute(sql1):
    print(row)
