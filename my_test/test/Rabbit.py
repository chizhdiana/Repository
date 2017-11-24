class Rabbit():
    def __init__(self,food):
        self.food = food

    def eats(self):
        print('Rabbit it:')
        return self.food

rabbit = Rabbit('clover')


print(rabbit.eats())
