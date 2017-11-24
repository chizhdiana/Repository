
def bouble_sort(arr):
    # внешний цикл по колличеству проходов
    for j in range(len(arr) ):
      # цикл по кол пар елементов для сравнения
      for i in range(len(arr)-1 ):

            if arr[i] > arr[i + 1]:
                arr[i],arr[i + 1] = arr[i + 1],arr[i]
    return arr

print(bouble_sort([1,7,9,0,5,8,2,4]))


def insert_sort(arr):
    # из массива по очередно берется каждый  ел сравнивается с пред идущим и вставляется в отсортированную часть
    for i in range(1,len(arr)):

        while i>0 and arr[i]>arr[i-1]:
            arr[i],arr[i-1]=arr[i-1],arr[i]
            i=i-1
    return  arr
print(insert_sort([54,1,0,3,52,3,1,2,3,5,3,67,3,2,543]))


def selection_sort(arr):

    # обозначить мин елем в массиве, твим его под индекс 0
    for i in range(0,len(arr)):

        min = i
        #поменять местами его и первый элемент в массиве  и так далее
        for j in range(i+1,len(arr)):
            if arr[j]> arr[min]:
                arr[j], arr[min]= arr[min], arr[j]
    return arr
print(selection_sort([54,1,0,3,52,3,1,2,3,5,3,67,3,2,543]))

#Сортировка слиянием

def merge(arr1, arr2):
    # добавление отсортированных елементов из двух массивов в один
    res=[]
    i=0
    j=0
    while i<len(arr1)and j<len(arr2):
        if arr1[i]<arr2[j]:
            res.append(arr1[i])
            i+=1

        else:
            res.append(arr2[j])
            j+=1
# добавляем оставшиеся елементы из двух массивов
    res+= arr1[i:]+arr2[j:]
    return res

def MergeSort(A):
    # разделение массива на два
    left =[]
    rigth =[]
    if len(A) <= 1:
        return A
    else:
        center = len(A)//2
        left += A [center:]
        rigth += A[:center]



    return merge(MergeSort(left), MergeSort(rigth))

print(MergeSort([54,1,0,3,52,3,1,2,3,5,3,67,3,2,543]))

print(MergeSort([54,1,0,3,52,3,1,2,3,5,3,67,3,2,543]))

