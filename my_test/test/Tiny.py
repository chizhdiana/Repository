import pickle # сохранить и восстановить обьект в бинарном формате
class Tiny():
    def __str__(self):
        return 'tiny'
obj1 = Tiny()
print(obj1)

pickled = pickle.dumps(obj1)# охранить даннные в файл
print(pickled)
# load - загрузить данные из файла
