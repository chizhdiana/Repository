import redis
import time

conn = redis.Redis()
now = time.time()
print(now)
# БИТЫ
days = ['2013-02-25', '2013-02-26', '2013-02-27']  # лист с датами
# ID пользователей
big_spender = 1089
tire_kicker = 4045
late_joiner = 550212
# установим бит на конкретную дату с одним посещением пользователя
print(conn.setbit(days[0], big_spender, 1))
print(conn.setbit(days[0], tire_kicker, 1))
print(conn.setbit(days[1], big_spender, 1))
print(conn.setbit(days[2], big_spender, 1))
print(conn.setbit(days[2], late_joiner, 1))
# счетчик ежедневных посещений за эти три дня:
#for day in days:
 #conn.bitcount(day)


print(conn.getbit(days[1], tire_kicker))
# Сколько пользователей посещает сайт каждый день?
# conn.bitop('and', 'everyday', *days)
print(conn.getbit('everyday', big_spender))

