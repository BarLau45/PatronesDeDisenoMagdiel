from Prototype import IPrototype

class Product(IPrototype):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def clone(self):
        return Product(self.name, self.price)
    
    def __str__(self):
        return f'{id(self)} - Product{{name = {self.name}", price = {self.price}}}'
    
    # def get_name(self)