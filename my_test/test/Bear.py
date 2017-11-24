class Bear():
    def __init__(self,food):
        self.food = food

    def eats(self):
        print('Bear it:')
        return self.food

bear = Bear('berries')


print(bear.eats())
