score = {"a": 1, "c": 3, "b": 3, "e": 1, "d": 2, "g": 2,
         "f": 4, "i": 1, "h": 4, "k": 5, "j": 8, "m": 3,
         "l": 1, "o": 1, "n": 1, "q": 10, "p": 3, "s": 1,
         "r": 1, "u": 1, "t": 1, "w": 4, "v": 4, "y": 4,
         "x": 8, "z": 10}

def scrabble_score(word):
    word = word.lower()
    sum =0
    total =0
    for letter in word:
         print (score[letter],)
         total +=score[letter]
    print (total)
    return total


print(scrabble_score('pie'))

def censor(text, word):
    t =[]
    str=text.split()
    str2 =""
    for i in str:
        if i==word:
            t.append("*" * len(i))
        else:
            t.append(i)
    return  "".join(t)


print(censor("this hack is wack hack", "hack"))

def count(sequence, item):
    count =0
    for found in sequence:
         if int(found) == item:
            print (found)
            count +=1
    print(count)
    return count
print(count([1,3,4,5,1,1,1],1))

def purity(numbers):
    list_s = []
    for i in numbers:
        if i%2==0:
            list_s.append(i)
    return   list_s
print (purity([1,3,4,5,6,7]))


def product(products):
    mult=1
    for i in products:
        mult =  mult *i
    return mult
print(product([1,3,2]))

