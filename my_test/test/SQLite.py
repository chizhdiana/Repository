import sqlite3
conn = sqlite3.connect('enterprise.db')
curs = conn.cursor()
#curs.execute(''' CREATE TABLE zoo(critter VARCHAR(20)PRIMARY KEY, count INT, damages FLOAT)''')
curs.execute('INSERT INTO zoo VALUES("duck",5,	0.0)')
curs.execute('INSERT INTO zoo VALUES("bear", 2, 1000.0)')
ins = 'INSERT INTO zoo (critter, count, damages)VALUES(?,?,?)'
curs.execute(ins,('weasel', 1, 2000.0))

curs.execute('Select * from zoo order by count')
print(curs.fetchall())