import csv
villains = [
    {'first': 'Doctor', 'last': 'No'},
    {'first': 'Rosa', 'last': 'Klebb'},
    {'first': 'Mister', 'last': 'Big'},
    {'first': 'Auric', 'last': 'Goldfinger'},
    {'first': 'Ernst', 'last': 'Blofeld'},
  ]
with open('villans', 'wt')as fout:
     cout= csv.DictWriter(fout,['first', 'last'])
     cout.writeheader()
     cout.writerows(villains)
with open('villans', 'rt')as fin:
    cin= csv.DictReader(fin)
    villains = [row for row in cin]
    print(villains)
