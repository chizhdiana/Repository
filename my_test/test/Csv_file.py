import csv
villains = [
    ['Doctor', 'No'],
    ['Rosa', 'Klebb'],
    ['Mister', 'Big'],
    ['Auric','Goldfinger'],
    ['Ernst', 'Blofffeld'],
     ]
with open ('villans', 'wt') as fout:
 csvout = csv.writer(fout)
 csvout.writerows(villains)

with open ('villans', 'rt') as fin:
    cin = csv.reader(fin,['bookk', 'autor'])
    villans = [row for row in cin]

    print(villans)
