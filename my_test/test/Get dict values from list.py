def namelist(names):
    namelist =  [name['name'] for name in names]
    print (namelist)
    if len(namelist) <= 1:
    	return ''.join(namelist)
    else:
    	lastTwo = ' & '.join(namelist[-2:])

    	first = [n + ',' for n in namelist[:-2]]

    	first.append(lastTwo)
    	return ' '.join(first)



namelist([ {'name': 'Bart'}, {'name': 'Lisa'}, {'name': 'Maggie'} ])
