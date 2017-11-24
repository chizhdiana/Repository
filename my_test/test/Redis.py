import redis
import time
conn = redis.Redis()
conn.keys('*')
conn.set('secret', 'ni!')
conn.set('carats', '24')
conn.set('fever', '101.5')

first = conn.get('secret')

print(first)

# set value only if key exsists
conn.setnx('secret', 'icky-icky-icky-ptang-zoop-boing!' )
second = conn.get('secret')
print(second)

# return old value and set new value

third = conn.getset('secret',  'icky-icky-icky-ptang-zoop-boing!')
print(third)
print(conn.get('secret'))

#  получим подстроку с помощью метода getrange()
print(conn.getrange('secret', -4,-1))
# Заменим подстроку с помощью метода setrange()
print(conn.setrange('secret', 0, 'ICKY'))
print(conn.get('secret'))
#  установим значения сразу нескольких ключей с помощью метода mset()
conn.mset({'pie': 'cherry', 'cordial': 'sherry'})
print(conn.mget(['fever', 'carats']))
#Удалим ключ с помощью метода delete():
conn.delete('fever')
#Выполним инкремент с помощью команд incr() и incrbyfloat() и декремент с помощью команды decr():
print(conn.incr('carats'))
print(conn.incr('carats',10))
print(conn.decr('carats'))
print(conn.decr('carats', 15))
conn.set('fever', 101.5)
print(conn.get('fever'))

# create List
print(conn.lpush('zoo', 'bear'))
#print(conn.lpush( 'alligator', 'duck'))
#Добавим один элемент до или после другого с помощью метода linsert():
print(conn.linsert('zoo', 'before', 'bear','beaver'))
print(conn.linsert('zoo', 'after', 'bear','cassovay'))

#Добавим элемент, указав смещение для него, с помощью метода lset() (список уже должен существовать):
print(conn.lset('zoo', 2, 'marmoset'))
#Добавим элемент в конец с помощью метода rpush():
print(conn.rpush('zoo','yak'))

#Получим элемент по заданному смещению с помощью метода lindex():
print(conn.lindex('zoo',3))
# Получим все элементы, находящиеся в диапазоне смещений, с помощью метода lrange()
print(conn.lrange('zoo', 0,2))

#Обрежем список с помощью метода ltrim(), сохранив только элементы в заданном диапазоне:
print(conn.ltrim('zoo', 0,-1))

# CREATE HASH
#Установим в хеше song значения полей do и re одновременно с помощью метода hmset():
conn.hmset('song', {'do':'a bear', 're':'about a bear'})

#Установим значение одного поля хеша с помощью метода hset():
conn.hset('song', 'mi', 'a note to follow re')
#Получим значение одного поля с помощью метода hget():
print(conn.hget('song', 'mi'))

#Получим значение нескольких полей с помощью метода hmget():
print(conn.hmget('song', 're','do'))

#Получим ключи всех полей хеша с помощью метода hkeys():
print(conn.hkeys('song'))

#Получим значения всех полей хеша с помощью метода hvals():
print(conn.hvals('song'))

#Получим количество полей хеша с помощью функции hlen():
print(conn.hlen('song'))

#Получим ключи и значения всех полей хеша с помощью метода hgetall():
print(conn.hgetall('song'))

#Создадим поле, если его ключ не существует, с помощью метода hsetnx():
print(conn.hsetnx('song', 'fa', 'a note that rhymes with la'))

# CREATE SET
#Добавим одно или несколько значений множества:
print(conn.sadd('zoo1', 'duck', 'goat','turkey'))

#Получим количество значений множества:
print(conn.scard('zoo1'))

#Получим все значения множества:
print(conn.smembers('zoo1'))

#Удалим значение из множества:
print(conn.srem('zoo1', 'turkey'))
print(conn.smembers('zoo1'))

#Создадим второе множество, чтобы продемонстрировать некоторые операции:
conn.sadd('better_zoo', 'tiger', 'wolf', 'duck')

#Пересечение множеств (получение общих членов) zoo и better_zoo:
print(conn.sinter('zoo1', 'better_zoo'))

#Выполним пересечение множеств zoo и better_zoo и сохраним результат в множестве fowl_zoo:
print(conn.sinterstore('folw_zoo', 'zoo1', 'better_zoo'))
print(conn.smembers('folw_zoo'))

#Выполним объединение (всех членов) множеств zoo и better_zoo:
print(conn.sunion('zoo1', 'better_zoo'))

#Используйте метод sdiff(), чтобы получить разность множеств, и метод sdiffstore(), чтобы сохранить ее в множестве zoo_sale:
print(conn.sdiff('zoo1', 'better_zoo'))
print(conn.sdiffstore('zoo_sale', 'zoo1','better_zoo'))
print(conn.smembers('zoo_sale'))



#Упорядоченные множества ZSET
now = time.time()
print(now)

conn.zadd('logins', 'sauron', now)
# Пять минут спустя добавим второго
conn.zadd('logins', 'sauron', now+(5*60))
#Через два часа:
conn.zadd('logins',	'bilbo',	now+(2*60*60))
# спустя сутки:
conn.zadd('logins', 'treebeard', now+(24*60*60))

#Каким по счету пришел bilbo?
print(conn.zrank('logins', 'bilbo'))
#Когда это было?
print(conn.zscore('logins', 'bilbo'))

# каким по счету пришел каждый гость:
print(conn.zrange('logins', 0,-1))








