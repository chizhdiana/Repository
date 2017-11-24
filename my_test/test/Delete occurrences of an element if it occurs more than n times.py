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





print(delete_nth([20,37,20,21], 1))
print(delete_nth([1,1,3,3,7,2,2,2,2], 3), [1, 1, 3, 3, 7, 2, 2, 2])
