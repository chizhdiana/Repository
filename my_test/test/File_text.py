
poem = ''' 'There was a young lady named Bright,
Whose	speed	was	far	faster	than	light;
 She started one day
 In a relative way,
 And returned on the previous night.'''
#print(len(poem))
fout = open('relativity', 'wt')
fout.write(poem)
fout.close()

#try:
 #fout = open('relativity', 'xt')
 #fout.write('stop, stop, stop')
#except FileExistsError:
    # print('relativity already exists!. That was a close one.')


#fout.close()


#print(poem, file=fout, sep='', end ='')

#fout.close()
poem = ''
fin = open('relativity', 'rt')
lines = fin.readlines()


fin.close()
print(len(lines), 'lines read')

for line in lines:
    print(line, end ='')
