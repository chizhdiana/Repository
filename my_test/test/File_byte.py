import os
bdata = bytes(range(0,256))
print(len(bdata))
fout = open('bfile', 'wb')
size = len(bdata)
offset = 0
chunk = 100
while True:
    if offset > size:
        break
    fout.write(bdata[offset:offset+chunk])
    offset += chunk

fout.close()

fin = open('bfile','rb')
print(fin.tell())
print(fin.seek(255))
bdata = fin.read()
print(len(bdata))
print(bdata[0])
print(os.SEEK_SET)
print(os.SEEK_CUR)
print(os.SEEK_END)
