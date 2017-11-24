class Element():
    def __init__(self, name, symbol, number):
        self.__name = name
        self.__symbol = symbol
        self.__number = number


    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, name):
     self.__name = name

    @property
    def symbol(self):
        return self.__symbol

    @symbol.setter
    def symbol(self, symbol):
       self.__symbol= symbol
    @property
    def number(self):
      return self.__number

    @number.setter
    def number(self, number):
     self.__number = number

hydrogen = Element('Hydrogen', 'H', 1)

print(hydrogen.name)
print(hydrogen.symbol)
print(hydrogen.number)












