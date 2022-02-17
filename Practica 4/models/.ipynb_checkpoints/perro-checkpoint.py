class Perro:   
    raza = 'Chihuahua'
    
    def __init__(self, nombre):
        self.nombre = nombre
        
    def toString(self):
        print(f"{self.nombre} raza: {self.raza}")