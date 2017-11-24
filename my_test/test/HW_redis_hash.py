import redis
conn = redis.Redis()
conn.hmset('test',{'count':'1','name':'Fester bestertester' })
content =  conn.hvals('test')

for item in content:
    print(item)
conn.hset('test','count',2)
first = conn.hget('test','count')
print(first)
