import  unicodedata
import re
mystery = '\U0001f4a9'
print(unicodedata.name(mystery))
pop_bytes = mystery.encode('utf-8')
print(pop_bytes)
pop_string = pop_bytes.decode('utf-8')
print(pop_string)
print('My kitty cat likes %s', ('roast_beef'))
print('My kitty cat likes %s', ('ham'))
print('My kitty cat feel on this %s', ('head'))
print('Fnd now thinks he is a %s', ('clam'))

letter = '''Dear {salutation} {name},
Thank you for your letter. We are sorry that our {product} {verbed} in your
{room}. Please note that it should never be used in a {room}, especially
near any {animals}.
Send us your receipt and {amount} for shipping and handling. We will send
you another {product} that, in our tests, is {percent}% less likely to\
have {verbed}.
Thank you for your support.
Sincerely,
{spokesman}
{job_title} '''

response = {'salutation':'salution', 'name':'Ann', 'product':'bread', 'verbed':'verb', 'room':'dinnerroom','animals':'cat', 'amount':'5', 'percent':'8', 'spokesman':'maks','job_title':'title'}
print(letter.format(**response))

mammonth = '''' We have seen thee, queen of cheese,
Lying quietly at your ease,
Gently fanned by evening breeze,
Thy fair form no flies dare seize.
All gaily dressed soon you'll go
To the great Provincial show,
To be admired by many a beau
In the city of Toronto.
Cows numerous as a swarm of bees,
Or as the leaves upon the trees,
It did require to make thee please,
And stand unrivalled, queen of cheese.
May you not receive a scar as
Intends to send you off as far as
The great world's show at Paris.
Of the youth beware of these,
For some of them might rudely squeeze
And bite your cheek, then songs or glees
We could not sing, oh! queen of cheese
We'rt thou suspended from balloon,
You'd cast a shade even at noon,
Folks would think it was the moon
About to fall and crush them soon.'''
# найти все члова, которые начинаются на с
path = r'\bc\w*'


m = re.findall(path, mammonth)

if m:
    print(m)

# Найдите все четырехбуквенные слова, которые начинаются с буквы «c»:
path = r'\bc\w{3}\b'
m = re.findall(path, mammonth)
if m:
    print(m)

# слова, которые заканчиваются на r
path = r'\b\w*r\b'
m = re.findall(path, mammonth)
if m:
    print(m)


# слова заканчивавающиеся на L исключить апостоф
path = r"\b[\w\']+l\b"
m = re.findall(path, mammonth)
if m:
    print(m)
# Найдите все слова, которые содержат три гласные подряд.
path = r'\b\w*[aeiou]{3}[^aeiou\s]\w*\b'

m = re.findall(path, mammonth)
if m:

    print(m)
