import math
from collections import OrderedDict
def iq(numbers):
    mod = [int(n) % 2 for n in numbers.split()]
    if sum(mod) == 1:
        return mod.index(1) + 1
    else:
        return mod.index(0) + 1

print(iq("2 4 7 8 10"))

def remove_smallest(numbers):
   # raise NotImplementedError("TODO: remove_smallest")
   # num = sorted(numbers)

        if len(numbers)==0:
           return []
        else:
          i=min(numbers)
          numbers.remove(i)

          return numbers
print(remove_smallest([]))


def is_square(n):

     if n < 0:
            return False
     else:
            return n % math.sqrt(n) == 0



print(is_square(4))


def get_middle(s):
    # your code here
    var = int(len(s)/2)

    if len(s)% 2 == 0:

         return s[var]

    else:

          return s[var]+s[var+1]


print(get_middle("teste"))


def solution(s):
    rs = []
    #n = len(s)
    for i in range(len(s)):
        print(range(len(s)))
        if i % 2 == 0:
            if i < len(s) - 1:
                rs.append(s[i] + s[i + 1])
            else:
                rs.append(s[i] + '_')

    return rs

print(solution("asdfadsf"))


def find_missing_letter(chars):
  lst= 'abcdefghijklmnopqrstuvwxyz'

  if chars[0].isupper():
      lst = lst.upper()
  element = lst.find(chars[0])
  print(element)

  for i in range(len(chars)):
      if chars[i] != lst[element+i]:
          return lst[element+i]



print( find_missing_letter(['O','Q','R','S']))

def expanded_form(num):

    return ' + '.join([x + '0' * i for i, x in enumerate(str(num)[::-1]) ][::-1])

print(expanded_form(4278990))

def expanded1_form(num):
    num = str(num)
    st=[]
    for i, x in enumerate(num[::-1]):
        if x!='0':
           st.append( x+'0' * i)
    return '+'.join(st)

print(expanded1_form(42780))


def title_case(title, minor_words):
    title = title.lower().split(' ')
    minor_words = minor_words.split(' ')
    for i in range(len(title)):
        if i == 0 or title[i] not in minor_words:
            title[i] = title[i].capitalize()

    return ' '.join(title)


print( title_case('a clash of KINGS', 'a an the of'))
#return ' '.join(c if c in minor_words.lower().split() else c.title() for c in title.capitalize().split())

def to_weird_case(string):

    string = list(string.lower())

    for i in range(len(string)):
        if i!=0 and i%2==0:

           string[i]=string[i].upper()
           #print(string)
        else:
            string[i]= string[i].lower()
            #print(str)
    return ''.join(string)

print(to_weird_case('This'))


def delete_nth(order, max_e):
  lst = order
  for i in lst:
      if lst.count(i) > max_e:
         k = lst.index(i)+1
         print(k)
         lst2 = lst[k: ]
         print(lst2)
         j = k + 1
         print(j)
         del(lst[j])
  return (lst)
print("yhiktjhyiotjhiothjitgjhitgjohtyio")
print( delete_nth([1,1,3,3,7,2,2,2,2], 3))

def revers(num):
    st= ''
    i= len(num)-1

    while i>=0:
        st+= str(num[i])
        i= i-1
    return st

print(revers('qwer'))


def make_readable(seconds):
    import datetime
    from datetime import time
    import time
    return time.strftime("%H:%M:%S", time.gmtime(seconds))

print( make_readable(86399))

def stock_list(listOfArt, listOfCat):
    dictofstock = {}
    dictofstock = dictofstock.fromkeys(listOfCat, 0)
    print(dictofstock)#{'A': 0, 'B': 0}
    for cat in listOfCat:
        for art in listOfArt:

            if art[0][0] == cat:
                dictofstock[cat] += int(art.split(' ')[1])
                print(dictofstock)
    listofstock = []

    for cat in listOfCat:
        listofstock.append('(' + cat + ' : ' + str(dictofstock[cat]) + ')')

    return (' - '.join(listofstock))

    return ' - '.join('({} : {})'.format(i,y)for i, y in dictionary.items())



print(stock_list(["ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"],["A", "B"]))

def sum_consecutives(s):
    lst = []

    for i in range(len(s)) :
        if s.count(i) <=1 :
            lst.append(i)
            print(lst)
        else:
            k= i+1

            lst.append(k)
    return lst
print(sum_consecutives([1,4,4,4,0,4,3,3,1]))

from urllib.parse import urlparse

def domain_name(url):

 data= url.split("//")[-1].split("/")[0]
 return data.split('.')[0]


print(domain_name("http://stackoverflow.com/questions/9626535/get-domain-name-from-url"))

def to_camel_case(text):
    lst = list(text)
    str=[]
    for i in lst:
        if i.isupper():

            str.append("_"+ i)
        else:
            str.append(i)

    return "".join(str)


print(to_camel_case("theStealthWarrior"))
